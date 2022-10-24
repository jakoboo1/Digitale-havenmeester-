package com.bp3.wvarneteam05.models;

public class Member extends Person{
    private boolean isMember;

    public Member(String name, String address, String residence, String phonenumber, String email, Boolean isMember) {
        super(name, address, residence, phonenumber, email);
        this.isMember = isMember;
    }

    public boolean getIsMember() {
        return isMember;
    }
}
