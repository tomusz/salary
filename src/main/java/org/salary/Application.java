package org.salary;

import org.salary.employee.Employee;
import org.salary.employee.EmployeesProvider;
import org.salary.files.PropertiesHolder;

import java.util.ArrayList;
import java.util.Objects;

public class Application {
    Company company;

    public Application(Company company) {
        this.company = company;
    }

    public void getEmployeesFromFile() {
        ArrayList<Employee> employeesFromFile = EmployeesProvider.getEmployeesFromFile(
                PropertiesHolder.appProperties.getProperty("path.employeesFile"));
        employeesFromFile.forEach(x -> company.addEmployee(x));
    }

    public void startApplication() {
        String userInputFromScanner = "";
        while (!Objects.equals(userInputFromScanner, "4")) {
            System.out.println("""
                    1 – Print sum of all employees salary
                                    
                    2 – Display all employees data
                                    
                    3 – Add new employee
                                    
                    4 – End program""");
            userInputFromScanner = UserInputProvider.getUserInputFromScanner();
            executeCommand(userInputFromScanner);
        }
    }

    private boolean executeCommand(String userInput) {
        switch (userInput) {
            case "1" -> System.out.println(company.getAllEmployeesCosts());
            case "2" -> System.out.println(company.getEmployees());
            case "3" -> company.addEmployee(EmployeesProvider.getEmployeeFromScanner());
            case "4" -> {
                return false;
            }
            default -> System.out.println(PropertiesHolder.appProperties.getProperty("application.requiredKey"));
        }
        return true;
    }

}
