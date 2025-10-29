package com.pluralsight;

import java.time.LocalDate;

public abstract class Asset {

    private String description;
    private LocalDate dateAcquired;
    protected double originalCost;

    public Asset(String description, LocalDate dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

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

    public abstract double getValue();

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

}
