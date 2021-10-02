package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle{
    private int currentSpeed;
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public Hero(int cs,String mn,String on,String rn){
        currentSpeed = cs;
        modelName = mn;
        ownerName = on;
        registrationNumber = rn;
    }

    public int getSpeed(){
        return currentSpeed;
    }
    public void radio(){
        System.out.println("Provides facility to control radio device");
    }

    public String getModelName(){
        return modelName;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String getOwnerName(){
        return ownerName;
    }

}
