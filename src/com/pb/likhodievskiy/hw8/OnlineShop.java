package com.pb.likhodievskiy.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auth auth = new Auth();

        System.out.println("Sign up");
        System.out.println("Enter login:");
        String signupLogin = scanner.nextLine();

        System.out.println("Enter password:");
        String signupPassword = scanner.nextLine();

        System.out.println("Enter confirm password:");
        String signupConfirmPassword = scanner.nextLine();

        try {
            auth.signUp(signupLogin, signupPassword, signupConfirmPassword);
        } catch (Exception e) {
            System.out.println("Sign up error: " + e.getMessage());
            System.exit(0);
        }

        System.out.println("Registration successful!\n");

        System.out.println("Sign in");
        System.out.println("Enter login:");
        String login = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        try {
            auth.signIn(login, password);
        } catch (Exception e) {
            System.out.println("Sign in error: " + e.getMessage());
            System.exit(0);
        }

        System.out.println("Login successful!");
    }
}