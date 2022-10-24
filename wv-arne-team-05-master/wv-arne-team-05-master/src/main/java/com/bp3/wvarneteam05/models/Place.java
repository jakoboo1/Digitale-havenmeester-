package com.bp3.wvarneteam05.models;

public class Place {
    private int number;
    private double length;
    private double width;

    public Place(int number, double length, double width) {
        this.number = number;
        this.length = length;
        this.width = width;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
