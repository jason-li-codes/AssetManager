package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> myAssets = new ArrayList<>() {{
            add(new Vehicle("well-maintained Toyota Corolla", LocalDate.of(2019, 11, 12), 15000.00,
                    "Toyota Corolla 2014", 2014, 105000));
            add(new House("older farmhouse with acreage", LocalDate.of(2019, 11, 30), 150000.00,
                    "555 Old Mill Rd", 2, 2000, 12000));
            add(new House("luxury penthouse with skyline view", LocalDate.of(2020, 7, 10), 1200000.00,
                    "101 Skyline Blvd", 4, 3500, 15000));
            add(new Vehicle("older sedan with low mileage", LocalDate.of(2021, 8, 20), 12000.00,
                    "Honda Civic 2015", 2015, 130000));
            add(new House("beautiful beachfront property", LocalDate.of(2022, 6, 15), 500000.00,
                    "123 Ocean Drive", 3, 3000, 10000));
            add(new Vehicle("compact hatchback with great fuel economy", LocalDate.of(2022, 12, 5), 18000.00,
                    "Ford Fiesta 2018", 2018, 60000));
            add(new Vehicle("sports car with high performance", LocalDate.of(2023, 5, 15), 30000.00,
                    "Chevrolet Camaro 2020", 2020, 25000));
            add(new House("spacious suburban home", LocalDate.of(2024, 10, 5), 350000.00,
                    "456 Maple St", 4, 2500, 8000));
            add(new House("charming cottage in the mountains", LocalDate.of(2025, 3, 22), 275000.00,
                    "789 Pine Ridge", 2, 1800, 6000));
            add(new Vehicle("luxury SUV with low mileage", LocalDate.of(2025, 7, 25), 45000.00,
                    "BMW X5 2021", 2021, 15000));
        }};

        System.out.println("Here are all your assets listed: ");
        System.out.println("====================================================================================================================");
        for (Asset asset : myAssets) {
            displayAssetInfo(asset);
        }
    }

    public static void displayAssetInfo(Asset asset) {
        // prints header
        System.out.println("+----------------------------------------------------------------------+--------------------+----------------------+");
        System.out.printf("|%-70s|%-20s|%-22s|\n", "Description", "Date Acquired", "Current Value");
        System.out.println("+----------------------------------------------------------------------+--------------------+----------------------+");
        // prints asset details
        System.out.printf("|%-70s|%-20s|$%-21.2f|\n", asset.getDescription(), asset.getDateAcquired(), asset.getValue());
        System.out.println("+----------------------------------------------------------------------+--------------------+----------------------+");

        if (asset instanceof House) {
            House h = (House) asset;
            // prints House-specific details header
            System.out.printf("|%-49s|%-20s|%-20s|%-22s|\n", "Address", "Condition (1 - 4)", "Square Footage", "Lot Size (sq ft)");
            System.out.println("+-------------------------------------------------+--------------------+--------------------+----------------------+");
            // prints House details
            System.out.printf("|%-49s|%-20d|%-20d|%-22d|\n", h.getAddress(), h.getCondition(), h.getSquareFoot(), h.getLotSize());
        } else {
            Vehicle v = (Vehicle) asset;
            // prints Vehicle-specific details header
            System.out.printf("|%-70s|%-20s|%-22s|\n", "Make & Model", "Year", "Mileage");
            System.out.println("+----------------------------------------------------------------------+--------------------+----------------------+");
            // prints Vehicle details
            System.out.printf("|%-70s|%-20d|%-22d|\n", v.getMakeModel(), v.getYear(), v.getOdometer());
            System.out.println("+----------------------------------------------------------------------+--------------------+----------------------+");
        }
        // prints asset separator
        System.out.println("====================================================================================================================");
    }

}
