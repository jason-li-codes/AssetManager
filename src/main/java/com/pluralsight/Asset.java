package com.pluralsight;

import java.time.LocalDate;

// abstract Asset class, meaning only child classes can be instantiated
public abstract class Asset {

    protected String description;
    protected LocalDate dateAcquired;
    protected double originalCost;

    public Asset(String description, LocalDate dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    // getters and setters, which can be used by child classes
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(LocalDate dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    // abstract method means child class must have Override for this method
    public abstract double getValue();

}
