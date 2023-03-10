package org.salary.employee;

import org.salary.files.PropertiesHolder;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Iterator;

public class EmployeeHandler {

    public static Employee getEmployee(String userInput) {
        String[] employeeElements = userInput.split(" ");
        Iterator<String> employeeIterator = Arrays.stream(employeeElements).iterator();
        return new Employee(employeeIterator.next(),
                employeeIterator.next(),
                extractSalary(employeeIterator));
    }

    private static double extractSalary(Iterator<String> employeeIterator) {
        double salary = Double.parseDouble(employeeIterator.next());
        if (!EmployeeValidation.hasSalaryGraterThenZero(salary)) {
            throw new InvalidParameterException(
                    PropertiesHolder.messageProperties.getProperty("salary.hasToBeMoreThenZero"));
        }
        return salary;
    }
}
