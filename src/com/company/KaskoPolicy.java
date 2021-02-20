package com.company;

import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.DAYS;

public class KaskoPolicy extends PolicyBase {
    private int driversAge;
    private int carsAge;

    public KaskoPolicy(LocalDateTime from, LocalDateTime to, int driversAge, int carsAge) {
        super(from, to);
        this.driversAge = driversAge;
        this.carsAge = carsAge;
    }

    public int getDriversAge() {
        return driversAge;
    }

    public int getCarsAge() {
        return carsAge;
    }

    @Override
    public double calculatePremium() {
        premium = 0.7 * (1/(double)carsAge) * DAYS.between(getFrom(), getTo());
        return premium;
    }

    @Override
    public void issue() {
        System.out.println("Kasko policy: " + getNumber() + " is prepared for issue");
        super.issue();
    }
}
