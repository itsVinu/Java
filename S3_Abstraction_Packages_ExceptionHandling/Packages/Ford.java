package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle{
    private int speed;
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public int speed(){
        System.out.println("Return current speed of the car");
        return speed;
    }
    public int tempControl(){
        System.out.println("Provides facility to control the air conditioning device present in the car");
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
