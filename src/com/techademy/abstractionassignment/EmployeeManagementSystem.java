package com.techademy.abstractionassignment;

abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract Methods
    public abstract double calculateSalary();
    public abstract void displayDetails();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Salary: " + calculateSalary()+"₹");
        System.out.println("---------------------------");
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hourly Rate: " + hourlyRate+"₹");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary()+"₹");
        System.out.println("---------------------------");
    }
}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		
		 Employee[] employees = new Employee[3];
	        
	        employees[0] = new FullTimeEmployee("John", 101, 5000);
	        employees[1] = new PartTimeEmployee("Smith", 102, 20, 80);
	        employees[2] = new PartTimeEmployee("Bob", 103, 25, 60);
	        
	        for (Employee emp : employees) {
	            emp.displayDetails();
	        }
	}

}
