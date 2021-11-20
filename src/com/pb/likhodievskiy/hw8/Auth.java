package com.pb.likhodievskiy.hw8;

public class Auth {

    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("^[a-zA-Z\\d]{5,20}$")) {
            throw new WrongLoginException("Incorrect login");
        }
        if (!password.matches("^[a-zA-Z\\d_]{5,}$")) {
            throw new WrongPasswordException("Incorrect password");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Your password and confirmation password do not match");
        }

        this.login = login;
        this.password = password;
    }

    public void signIn(String login, String password) throws WrongLoginException {
        if (!this.login.equals(login) || !this.password.equals(password)) {
            throw new WrongLoginException("Incorrect login/password");
        }
    }
}