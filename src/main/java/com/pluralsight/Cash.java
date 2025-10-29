package com.pluralsight;

import java.time.LocalDate;

public class Cash extends Asset {

    // House constructor uses Asset constructor and adds no attributes, sets default description String
    public Cash(LocalDate dateAcquired, double originalCost) {
        super("cold hard cash, stuffed under the mattress", dateAcquired, originalCost);
    }

    @Override // Override method for getValue
    public double getValue() {
        return originalCost;
    }

}
