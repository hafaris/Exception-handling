package com.techademy.assignments0502;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
}

public class StreamApiAssignment {
    public static void main(String[] args) {
        // Step 1: Create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 28, 50000),
            new Employee("Bob", 35, 70000),
            new Employee("Charlie", 40, 90000),
            new Employee("David", 25, 45000),
            new Employee("Eve", 32, 75000)
        );

        // Step 2: Use Stream API to filter employees older than 30
        List<String> employeeNames = employees.stream()
            .filter(emp -> emp.getAge() > 30)  // Filter employees older than 30
            .map(Employee::getName)           // Extract employee names
            .collect(Collectors.toList());    // Collect names into a List

        // Step 3: Calculate the average salary of filtered employees
        double averageSalary = employees.stream()
            .filter(emp -> emp.getAge() > 30)  // Filter employees older than 30
            .mapToDouble(Employee::getSalary) // Extract salaries
            .average()                         // Compute average salary
            .orElse(0.0);                      // Default to 0 if no employees match

        // Step 4: Print the results
        System.out.println("Employees older than 30: " + employeeNames);
        System.out.println("Average Salary of these employees: " + averageSalary);
    }
}

