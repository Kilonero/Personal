package com.gorbachev.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class Departament {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Department {
        private Long id;
        private String name;
        private List<Employee> employees;


    }
}
