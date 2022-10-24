package com.bp3.wvarneteam05.controllers;

import com.bp3.wvarneteam05.models.Boat;

public class BoatController {

    public Boat AddBoat(String length, String width, String height, String depth){
        return new Boat(length, width, height, depth);
    }

}
