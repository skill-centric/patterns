package com.skillcentric;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private String name;
    private double salary;

    private List<Employee> employees = new ArrayList<>();

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary() + "\n");

        for (Employee employee : employees) {
            employee.print();
        }
    }
}