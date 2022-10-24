package com.bp3.wvarneteam05.models;

import com.bp3.wvarneteam05.views.Harbor;

import java.time.LocalDate;

public class Booking {
    private String boat;
    private Harbor harbor;
    private LocalDate startdate, enddate;
    private Berth berth;
    private Person person;

    public Booking() {

    }

    public String getBoat() {
        return boat;
    }

    public void setBoat(String boat) {
        this.boat = boat;
    }

    public Harbor getHarbor() {
        return harbor;
    }

    public void setHarbor(Harbor harbor) {
        this.harbor = harbor;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public Berth getBerth() {
        return berth;
    }

    public void setBerth(Berth berth) {
        this.berth = berth;
    }

    public void setPerson(Person person){
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
