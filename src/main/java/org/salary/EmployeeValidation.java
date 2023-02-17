package org.salary;

import java.util.regex.Pattern;

public class EmployeeValidation {

    //TODO:Waliduj wprowadzane przez użytkownika dane (imie/nazwisko nie może być puste,
    // a zarobki muszą być wieksze od 0

    private static final Pattern NAME_OR_SURNAME = Pattern.compile("[a-zA-Z]+");
    private static final Pattern SALARY = Pattern.compile(
            "[0-9]+[.]?[0-9]?[0-9]?");
//    private static final Pattern expectedInputPattern = Pattern.compile(
//            "/^[a-zA-Z]+(?:\\s[a-zA-Z]+)(?:\\s[0-9]+[.]?[0-9]?[0-9]?)");

    private static final Pattern expectedInputPattern = Pattern.compile(
            "/^" + NAME_OR_SURNAME + "+(?:\\s"
                    + NAME_OR_SURNAME + ")(?:\\s"
                    + SALARY + ")");

    public static boolean hasExpectedFormat(String userInput) {
        return userInput.matches(expectedInputPattern.toString());
    }

    public static boolean isNameOrSurname(String userInput) {
        return userInput.matches(NAME_OR_SURNAME.toString());
    }

    public static boolean isSalary(String userInput) {
        return userInput.matches(SALARY.toString());
    }

    public static boolean hasSalaryGraterThenZero(String userInput) {
        return salary > 0;
    }
}
