package stream_api_program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeOne {
    private String name;
    private int id;
    private String dept;
    private double salary;
    private int dojYear; // Year of joining

    // Constructor
    public EmployeeOne(String name, int id, String dept, double salary, int dojYear) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.salary = salary;
        this.dojYear = dojYear;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDojYear() {
        return dojYear;
    }

    public void setDojYear(int dojYear) {
        this.dojYear = dojYear;
    }

    // ToString method for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", dojYear=" + dojYear +
                '}';
    }
}

public class FindEmployeeDetailsUsingStreams {

    public static void main(String[] args) {
        // List of employees
        List<EmployeeOne> employees = Arrays.asList(
                new EmployeeOne("Aravind", 101, "Engineering", 75000.00, 2020),
                new EmployeeOne("Priya", 102, "HR", 60000.00, 2019),
                new EmployeeOne("John", 103, "Finance", 50000.00, 2018),
                new EmployeeOne("Ravi", 104, "Engineering", 80000.00, 2021)
        );

        // Stream to get name and dept
        List<String> nameAndDept = employees.stream()
                .map(emp -> "Name: " + emp.getName() + ", Dept: " + emp.getDept()) // Map to name and dept
                .collect(Collectors.toList()); // Collect to a list

        // Print results
        nameAndDept.forEach(System.out::println);
        // output :
        // Name: Aravind, Dept: Engineering
        // Name: Priya, Dept: HR
        // Name: John, Dept: Finance
        // Name: Ravi, Dept: Engineering

        // Stream to get only names
        List<String> names = employees.stream()
                .map(EmployeeOne::getName) // Extract only the name
                .collect(Collectors.toList()); // Collect to a list

        // Print names
        names.forEach(System.out::println);
        // output :
        // Aravind
        // Priya
        // John
        // Ravi

        // Filter employees who joined after 2019
        List<EmployeeOne> filteredEmployees = employees.stream()
                .filter(emp -> emp.getDojYear() > 2019) // Filter condition
                .collect(Collectors.toList()); // Collect to a list

        // Print filtered employees
        filteredEmployees.forEach(System.out::println);
        // output :
        // Employee{name='Aravind', id=101, dept='Engineering', salary=75000.0, dojYear=2020}
        // Employee{name='Ravi', id=104, dept='Engineering', salary=80000.0, dojYear=2021}

        employees.stream()
                .filter(emp -> emp.getDojYear() > 2019).forEach(System.out::println);
        // output :
        // Employee{name='Aravind', id=101, dept='Engineering', salary=75000.0, dojYear=2020}
        // Employee{name='Ravi', id=104, dept='Engineering', salary=80000.0, dojYear=2021}
    }

}
