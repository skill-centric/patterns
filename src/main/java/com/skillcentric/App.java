package com.skillcentric;

import java.util.logging.Logger;

public class App {

    private static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        Employee employeeOne = new Employee.EmployeeBuilder("Mike",
                "Jackson", 23, 2341)
                .setAddress("862 Peg Shop Street Yonkers, NY 10701")
                .setMail("test@example.com")
                .setPhone("123-456")
                .build();

        log.info("employeeOne: " + employeeOne);

        Employee employeeTwo = new Employee.EmployeeBuilder("Mike",
                "Jackson", 23, 2341)
                .setAddress("862 Peg Shop Street Yonkers, NY 10701")
                .setPhone("123-456")
                .build();

        log.info("employeeTwo: " + employeeTwo);

        Employee employeeThree = new Employee.EmployeeBuilder("Mike",
                "Jackson", 23, 2341)
                .setMail("test@example.com")
                .setPhone("123-456")
                .build();

        log.info("employeeThree: " + employeeThree);
    }
}
