package com.bp3.wvarneteam05.models;

public class Person {
    private String name;
    private String address;
    private String residence;
    private String phonenumber;
    private String email;


    public Person(String name, String address, String residence, String phonenumber, String email) {
        this.name = name;
        this.address = address;
        this.residence = residence;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

