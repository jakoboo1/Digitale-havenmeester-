package com.bp3.wvarneteam05.controllers;

import com.bp3.wvarneteam05.models.Member;
import com.bp3.wvarneteam05.models.Person;

public class PersonController {

    public Person CreatePerson(String name, String address, String city, String phonenumber, String email){
        return new Person(name, address, city, phonenumber, email);
    }

    public Person CreateMember(String name, String address, String city, String phonenumber, String email){
        return new Member(name, address, city, phonenumber, email, true);

    }
}
