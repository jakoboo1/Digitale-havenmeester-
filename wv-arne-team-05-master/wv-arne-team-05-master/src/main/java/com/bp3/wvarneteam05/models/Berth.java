package com.bp3.wvarneteam05.models;

public class Berth extends Place {
    private int harborId;
    private boolean hasElectricity;

    public Berth(double length, double width, int number, int harborId, boolean hasElectricity) {
        super(number, length, width);
        this.harborId = harborId;
        this.hasElectricity = hasElectricity;
    }

    public boolean hasElectricity() {
        return hasElectricity;
    }

    public int getHarbor() {
        return harborId;
    }

    public void setHarbor(int harborId) {
        this.harborId = harborId;
    }
}
