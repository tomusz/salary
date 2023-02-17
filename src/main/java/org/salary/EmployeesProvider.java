package org.salary;

import java.util.List;
import java.util.Scanner;

public class EmployeesProvider {

    private static final String SCANNER_MESSAGE = """
            Please provide employee's data as follow
            Ben Smith 100000 or Ben Smith 10000.00""";

    public static Employee getEmployeeFromScanner() {
        return EmployeeHandler.getEmployee(getUserInput());
    }

    public static List<Employee> getEmployeesFromFile() {
        //TODO:provide implementation from file
        //TODO:format to be decided
        return null;
    }

    private static String getUserInput() {
        String userInput;
        do {
            System.out.println(SCANNER_MESSAGE);
            userInput = UserInputProvider.getUserInputFromScanner();
        } while (EmployeeValidation.hasExpectedFormat(userInput));
        return userInput;
    }
}
