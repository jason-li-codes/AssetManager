package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    // Vehicle constructor uses Asset constructor and adds attributes
    public Vehicle(String description, LocalDate dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    // getters and setters
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

    @Override // Override method for getValue
    public double getValue() {
        // finds the age of the car by taking difference between current year and year of car model
        int carAge = LocalDate.now().getYear() - year;
        double carValue = this.originalCost;
        // determines carValue by using carAge, with a default of 1000 if carAge is too high
        if (carAge <= 3) {
            carValue *= 1 - (0.03 * carAge);
        } else if (carAge <= 6) {
            carValue *= 1 - (0.06 * carAge);
        } else if (carAge < 10) {
            carValue *= 1 - (0.08 * carAge);
        } else {
            carValue = 1000;
        }
        // if odometer reading is too high, decrease value further, unless makeModel is a Honda or toyota
        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") &&
                makeModel.toLowerCase().contains("toyota")) {
            carValue *= 0.75;
        }
        return carValue;
    }

}
