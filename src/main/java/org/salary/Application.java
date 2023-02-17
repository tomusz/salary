package org.salary;

public class Application {

    Company company;

    public Company getCompany() {
        return company;
    }

    public Application(Company company) {
        this.company = company;
    }

    //TODO:Application implementation
    //TODO:while loop / print menu
    //TODO:print all employees data
    //TODO:add new employee
    //TODO:end program
    //TODO:default zła opcja spróbuj jeszcze raz
    public void provideEmployeesInConsole() {
        System.out.println("Add new employee");
        for ()
            System.out.println("Add new employee");
            executeCommand("3");
        }
    }

    public void getEmployeesFromJSON() {

    }

    public void startApplication() {
        while (true) {
            System.out.println("""
                    1 – Print sum of all employees salary
                                    
                    2 – Display all employees data
                                    
                    3 – Add new employee
                                    
                    4 – End program""");
            executeCommand(UserInputProvider.getUserInputFromScanner());
        }

    }

    private boolean executeCommand(String userInput) {
        switch (userInput) {
            case "1" -> company.getAllEmployeesCosts();
            case "2" -> System.out.println(company.getEmployees());
            case "3" -> company.addEmployee(EmployeesProvider.getEmployeeFromScanner());
            case "4" -> {
                return false;
            }
            default -> System.out.println("You have provided wrong value. Use values from 1 to 4. Menu below.");
        }
        return true;
    }

}
