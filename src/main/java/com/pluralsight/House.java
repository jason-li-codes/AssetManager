package com.pluralsight;

import java.time.LocalDate;

public class House extends Asset {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, LocalDate dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public int getCondition() {
        return condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {

        return switch (condition) {
            case 1 -> 180 * squareFoot + 0.25 * lotSize;
            case 2 -> 130 * squareFoot + 0.25 * lotSize;
            case 3 -> 90 * squareFoot + 0.25 * lotSize;
            case 4 -> 80 * squareFoot + 0.25 * lotSize;
            default -> this.originalCost;
        };
    }


}
