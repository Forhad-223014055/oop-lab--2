/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.student1op;

/**
 *
 * @author DELL
 */
public class Student1op {

    private int id;
    private String name;
    private String department;
    private double cgpa;
  
    private static int totalStudents = 0;

    public Student1op(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        totalStudents++;
    }
    public void displayStudentDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }
    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + totalStudents);
    }

    public static final String university = "ABC University";
    
    public static void main(String[] args) {
        int id = 1;
        String name = "John Doe";
        String department = "Computer Science";
        double cgpa = 3.8;
        Student1op student1op = new Student1op(id, name, department, cgpa);
        student1op.displayStudentDetails();

             id = 2;
        name = "Jane Smith";
        department = "Electrical Engineering";
        cgpa = 4.0;
        Student1op student2 = new Student1op(id, name, department, cgpa);
        student2.displayStudentDetails();

        
        id = 3;
        name = "Michael Johnson";
        department = "Mechanical Engineering";
        cgpa = 3.5;
        Student1op student3 = new Student1op(id, name, department, cgpa);
        student3.displayStudentDetails();

        Student1op.displayTotalStudents();
    }
}

