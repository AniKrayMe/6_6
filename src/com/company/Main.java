package com.company;

public class Main {

    public static void main(String[] args) {
        DistanceConverter distanceConverter = new DistanceConverter(200,5);
        distanceConverter.convertMetersToMiles();
        distanceConverter.convertMilesToMeters();
    }
}
