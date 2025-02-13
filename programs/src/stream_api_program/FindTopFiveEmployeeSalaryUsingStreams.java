package stream_api_program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int salary;

    // Constructor
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    // toString method for display
    @Override
    public String toString() {
        return "Employee {" + "id=" + id + ", name='" + name + '\'' +
                ", salary=" + salary + '}';
    }
}


public class FindTopFiveEmployeeSalaryUsingStreams {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 500),
                new Employee(2, "Bob", 600),
                new Employee(3, "Charlie", 470),
                new Employee(4, "Diana", 910),
                new Employee(5, "Eve", 660),
                new Employee(6, "Frank", 200),
                new Employee(7, "Grace", 880)
        );

        // Get top 5 employees by salary in descending order
        List<Employee> topFiveEmployees = employees.stream()
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary())) // Sort in descending order
                .limit(5)  // Limit to top 5
                .collect(Collectors.toList());

        topFiveEmployees.forEach(System.out::println);
        // output :
        // Employee {id=4, name='Diana', salary=910}
        // Employee {id=7, name='Grace', salary=880}
        // Employee {id=5, name='Eve', salary=660}
        // Employee {id=2, name='Bob', salary=600}
        // Employee {id=1, name='Alice', salary=500}

        // Get second highest salary of employees
        Optional<Employee> secondHighestSalaryEmployee = employees.stream()
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary())) // Sort in descending order
                .skip(1)
                .findFirst();

        if(secondHighestSalaryEmployee.isPresent()) {
            System.out.println("Second Largest salary of Employee : " + secondHighestSalaryEmployee.get());
            // output : Second Largest salary of Employee : Employee {id=7, name='Grace', salary=880}
        } else {
            System.out.println("No second largest salary employee found.");
        }

        Optional<Integer> secondHighestSalary = employees.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        // .distinct() // Remove salary duplicates
        // .sorted(Comparator.reverseOrder()) // Sort in descending order
        // .skip(1) // Skip the first (largest salary) element
        // .findFirst(); // Get the second largest salary element

        secondHighestSalary.ifPresent(salary -> System.out.println("Second Highest salary of an employee : " + salary));
        // output : Second Highest salary of an employee : 880
    }
}
