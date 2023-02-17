package org.salary.employee;

import java.util.regex.Pattern;

public class EmployeeValidation {
    private static final Pattern expectedInputPattern = Pattern.compile(
            "^[a-zA-Z]+(?:\\s[a-zA-Z]+)(?:\\s[0-9]+[.]?[0-9]?[0-9]?)");

    public static boolean hasExpectedFormat(String userInput) {
        return userInput.matches(expectedInputPattern.toString());
    }

    public static boolean hasSalaryGraterThenZero(double userInput) {
        return userInput > 0;
    }
}
