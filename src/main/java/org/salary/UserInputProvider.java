package org.salary;

import java.util.Scanner;

public class UserInputProvider {

    public static String getUserInputFromScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
