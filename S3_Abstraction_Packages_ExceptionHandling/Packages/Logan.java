package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle{
    private int speed;
    private String modelName;
    private String registrationNumber;
    private String ownerName;


    public int speed(){
        return speed;
    }

    public int gps(){
        System.out.println("Provides facility to control the gps device");
        return 0;
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
