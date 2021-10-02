package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle{
    public int currentSpeed;

    public int getSpeed(){
        return currentSpeed;
    }
    public void cdplayer(){
        System.out.println("Provides facility to control the cd player device which is available in the car");
    }

    public String getModelName(){
        return "Hero";
    }
    public String getRegistrationNumber(){
        return "Hero registration number";
    }
    public String getOwnerName(){
        return "Hero owner name";
    }

}

