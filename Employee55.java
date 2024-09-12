/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employee55;

/**
 *
 * @author DELL
 */
public class Employee55 {
    private String name;
    private int age;
    private String designation;
    private double salary;
    private static String companyName;
    private static String companyAddress;
    private static int employeeCount = 0;

    public Employee55(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        employeeCount++;
    }
    public static void setCompanyDetails(String name, String address) {
        companyName = name;
        companyAddress = address;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
        System.out.println();
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Number of Employees: " + employeeCount);
    }
    public static void main(String[] args) {
       
        Employee55.setCompanyDetails("Tech Solutions", "053 Tech Lane");

        Employee55 emp1 = new Employee55("Ahad", 30, "Developer", 70000);
        Employee55 emp2 = new Employee55("Bushra", 28, "Designer", 65000);
        Employee55 emp3 = new Employee55("Tisha", 35, "Manager", 80000);
        
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        Employee55.displayTotalEmployees();
    }
}

