package com.company;
import java.util.Scanner;

public class Authentication {
    private static final String LOGIN = "Alexandr";
    private static final String PASSWORD = "root";

    public static int authenticate() {
        Scanner str = new Scanner(System.in);
        boolean isLoginSuccess = false;
        for (int i = 3; i != 0 && !isLoginSuccess; i--) {
            String login;
            String password;

            System.out.println("Login: ");
            login = str.nextLine();
            System.out.println("Password: ");
            password = str.nextLine();
            if (login.equals(LOGIN) && password.equals(PASSWORD)) {
                isLoginSuccess = true;
            }
        }
        return isLoginSuccess ? 0: -1;
    }
}
