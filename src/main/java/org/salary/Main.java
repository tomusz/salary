package org.salary;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Application app = new Application(company);
        app.getEmployeesFromFile();
        app.startApplication();
    }
}