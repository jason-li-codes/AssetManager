package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, LocalDate dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {

        int carAge = LocalDate.now().getYear() - year;
        double carValue = this.originalCost;

        if (carAge <= 3) {
            carValue *= 1 - (0.03 * carAge);
        } else if (carAge <= 6) {
            carValue *= 1 - (0.06 * carAge);
        } else if (carAge < 10) {
            carValue *= 1 - (0.08 * carAge);
        } else {
            carValue = 1000;
        }

        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") &&
                makeModel.toLowerCase().contains("toyota")) {
            carValue *= 0.75;
        }
        return carValue;
    }

}
