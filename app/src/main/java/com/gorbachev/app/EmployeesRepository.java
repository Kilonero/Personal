package com.gorbachev.app;

import com.gorbachev.model.Employee;


import java.util.List;
import java.util.Optional;

public interface EmployeesRepository {
    List<Employee> findAll();

    Optional<Employee> find(long id);

    Employee save(Employee employee);

    Optional<Employee> remove(long id);
}

