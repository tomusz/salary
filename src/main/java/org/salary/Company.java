package org.salary;

import org.salary.employee.Employee;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
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
        StringBuilder employeesList = new StringBuilder();
        for (Employee employee : employees) {
            employeesList.append(employee.toString()).append("\n");
        }
        return employeesList.toString().trim();
    }
}
