package com.gorbachev.model;

import java.util.Objects;

public class Personal {
    private String login;
    private int password;
    private String name;
    private int age;

    public Personal(String login, int password, String name, int age) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "personal{" +
                "login='" + login + '\'' +
                ", password=" + password +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personal personal = (Personal) o;
        return password == personal.password && age == personal.age && Objects.equals(login, personal.login) && Objects.equals(name, personal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, name, age);
    }
}
