package org.salary;

import java.util.Arrays;
import java.util.Iterator;

public class EmployeeHandler {

    public static Employee getEmployee(String userInput) {
        String[] employeeElements = userInput.split(" ");
        Iterator<String> employeeIterator = Arrays.stream(employeeElements).iterator();
        //TODO:double more then zero
        return new Employee(employeeIterator.next(),
                employeeIterator.next(),
                Double.parseDouble(employeeIterator.next()));
    }
}
