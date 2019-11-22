package com.company;

public class DistanceConverter {
    private int meter;
    private int mile;

    //region Getter and Setter

    public int getMeter() {
        return meter;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }
    //endregion

    public void convertMetersToMiles() {
        double result = this.meter * 0.000621;
        System.out.println(this.meter + " meters = " + result + " miles");
    }

    public void convertMilesToMeters() {
        double result = this.mile * 1609.344;
        System.out.println(this.mile+" miles = "+result + " meters");
    }
    //region Constructor
    public DistanceConverter(int meter, int mile) {
        this.meter = meter;
        this.mile = mile;
    }

    public DistanceConverter() {
    }
    //endregion

}
