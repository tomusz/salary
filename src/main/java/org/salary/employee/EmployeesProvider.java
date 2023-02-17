package org.salary.employee;

import org.salary.UserInputProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;

public class EmployeesProvider {

    private static final String SCANNER_MESSAGE = """
            Please provide employee's data as follow
            Ben Smith 100000 or Ben Smith 10000.00""";
    private static final String WRONG_FORMAT = "Each employee should be in separate line and keep pattern: Ben Clock 1234";

    public static Employee getEmployeeFromScanner() {
        return EmployeeHandler.getEmployee(getUserInput());
    }

    public static ArrayList<Employee> getEmployeesFromFile(String path) {
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!EmployeeValidation.hasExpectedFormat(line)) {
                    throw new InvalidPropertiesFormatException(WRONG_FORMAT);
                }
                employees.add(EmployeeHandler.getEmployee(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    private static String getUserInput() {
        String userInput = "";
        while (!EmployeeValidation.hasExpectedFormat(userInput)) {
            System.out.println(SCANNER_MESSAGE);
            userInput = UserInputProvider.getUserInputFromScanner();
        }
        return userInput;
    }
}
