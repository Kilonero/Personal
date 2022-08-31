package com.gorbachev.app;

import com.gorbachev.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

public class EmployeesRepositoryPostgres implements EmployeesRepository {

    private Map<Long, Employee> map = new ConcurrentHashMap<>();
    private static volatile EmployeesRepositoryPostgres instance;

    private void EmloyeesRepositoryPostgres() {
        map.put(1L, new Employee(1L, "Alivina", 27, 2000));
        map.put(2L, new Employee(2L, "Diana", 25, 1000));
        map.put(3L, new Employee(3L, "Ariana", 20, 1500));
    }

    public static EmployeesRepositoryPostgres getInstance() {
        if (instance == null) {
            synchronized (EmployeesRepositoryPostgres.class) {
                if (instance == null) {
                    instance = new EmployeesRepositoryPostgres() {
                        @Override
                        public List<Employee> findAll() {
                            return null;
                        }
                    };
                }
            }
        }
        return instance;
    }

    public Optional<Employee> find(long id) {
        return Optional.ofNullable(map.get(id));
    }

    public Employee save(Employee employee) {
        Long id = employee.getId();
        if (id == null) {
            id = generatedId();
            employee.setId(id);
        }
        map.put(id, employee);
        return employee;
    }

    private long generatedId() {
        long id;
        do {
            id = ThreadLocalRandom.current().nextLong(1,1_100);
        } while (map.containsKey(id));
        return  id;
    }

    public Optional<Employee> remove(long id) {
        return Optional.ofNullable(map.remove(id));
    }
}
