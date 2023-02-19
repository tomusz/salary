package org.salary.employee;

import org.salary.files.PropertiesHolder;

import java.util.regex.Pattern;

public class EmployeeValidation {
    private static final Pattern expectedInputPattern = Pattern.compile(
            PropertiesHolder.appProperties.getProperty("input.pattern"));

    public static boolean hasExpectedFormat(String userInput) {
        return userInput.matches(expectedInputPattern.toString());
    }

    public static boolean hasSalaryGraterThenZero(double userInput) {
        return userInput > 0;
    }
}
