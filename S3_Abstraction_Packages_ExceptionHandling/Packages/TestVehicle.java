package com.automobile;

import com.automobile.twowheeler.*;

public class TestVehicle {
    public static void main(String[] args) {
        Hero h1 = new Hero(459,"HR35","Aakash","DL7935");

        System.out.println(h1.getModelName());
        System.out.println(h1.getOwnerName());
        System.out.println(h1.getRegistrationNumber());
    }
}
