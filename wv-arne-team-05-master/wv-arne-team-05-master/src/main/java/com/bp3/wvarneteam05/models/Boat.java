package com.bp3.wvarneteam05.models;

public class Boat {
    private String length;
    private String width;
    private String height;
    private String depth;

    public Boat(String length, String width, String height, String depth){
        this.length = length;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }
}
