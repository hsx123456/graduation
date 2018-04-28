package com.hsx.model;

/**
 * Created by xing on 18/4/28.
 */
public class Coordinate {
    //坐标x
    private double x;
    //坐标y
    private double y;

    public Coordinate() {
    }

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
