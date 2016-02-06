package com.example.yuqing.myapplication;

/**
 * Created by Yuqing on 2/6/2016.
 */
public class Position {

    private double xCoord;
    private double yCoord;


    public Position(double xCoord, double yCoord){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public void setxCoord(double xCoord){
        this.xCoord = xCoord;
    }

    public void setyCoord(double yCoord){
        this.yCoord = yCoord;
    }

    public double getxCoord(){
        return xCoord;
    }

    public double getyCoord(){
        return yCoord;
    }
}
