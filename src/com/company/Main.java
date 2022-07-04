package com.company;
import com.commands.CommandsReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello. Please, confirm login.");
        //authentication
        int code = Authentication.authenticate();
        if (code == 0) {
            System.out.println("Login success");
            System.out.println("Write a command");
            CommandsReader.executionOperations();
        } else {
            System.out.println("Login failed");
        }
    }
}
