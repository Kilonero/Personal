package com.gorbachev.app;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class RepositoryFactory {
    private RepositoryFactory() {

    }

    public static EmployeesRepository getEmployeesRepository() {
        Properties applicationProperties = new Properties();
        try {
            applicationProperties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("applicationProperties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String repositoryType = applicationProperties.getProperty("repository.type").toLowerCase();

        switch (repositoryType) {
            case "memory":
                return EmployeesRepositoryInMemory.getInstance();
            case "postgres":
                return EmployeesRepositoryPostgres.getInstance();
            default:
                throw  new RuntimeException("Invailid repository type: " + repositoryType);
        }
    }
}
