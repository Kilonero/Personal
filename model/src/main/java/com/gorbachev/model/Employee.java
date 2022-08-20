package com.gorbachev.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Employee {
        private Long id;
        private String name;
        private int age;
        private int salary;
        private List<Departament> departments;


        public Employee(Long id, String name, int age, int salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
    }

