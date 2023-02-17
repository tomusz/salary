package org.salary;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
    private ArrayList<Employee> employees;

    public Company() {
    }

    public Company(Employee employee) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee);
        this.employees = employees;
    }

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public double getAllEmployeesCosts() {
        double totalCosts = 0;
        for (Employee employee : employees) {
            totalCosts += employee.getSalary();
        }
        return totalCosts;
    }

    @Override
    public String toString() {
        //TODO: check for refactor
        StringBuilder employeesList = new StringBuilder();
        for (Employee employee : employees) {
            employeesList.append(employee.toString()).append("\n");
        }
        return employeesList.toString().trim();
    }
}
