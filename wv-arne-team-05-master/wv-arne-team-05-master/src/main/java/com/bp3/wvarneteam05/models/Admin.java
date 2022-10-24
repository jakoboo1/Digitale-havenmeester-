package com.bp3.wvarneteam05.models;

public class Admin extends Person{

    public static String User;
    public static String Password;

    public Admin(String name, String adress, String residence, String phone, String email, String user, String password) {
        super(name, adress, residence, phone, email);
        User = user;
        Password = password;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

}
