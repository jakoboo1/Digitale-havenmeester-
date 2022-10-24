package com.bp3.wvarneteam05.controllers;

import com.bp3.wvarneteam05.Main;
import com.bp3.wvarneteam05.views.AdminReservations;
import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.Objects;

import static com.bp3.wvarneteam05.models.Admin.Password;
import static com.bp3.wvarneteam05.models.Admin.User;

public class AdminController {

    public String checkUser = "admin";
    public String checkPassword = "root";
    private ArrayList<Object> list;

    public AdminController(){
        list = new ArrayList<>();
    }

    public void save(Object o){
        list.add(0);
    }

    public boolean logIn(){
        if (Objects.equals(User, checkUser) && Objects.equals(Password, checkPassword)){
            return true;
        }else {
            return false;
        }
    }

}
