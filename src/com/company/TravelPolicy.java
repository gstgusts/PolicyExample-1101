package com.company;

import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.DAYS;

public class TravelPolicy extends PolicyBase {
    private String country;
    private int numberOfPersons;

    public TravelPolicy(LocalDateTime from, LocalDateTime to, String country, int numberOfPersons) {
        super(from, to);
        this.country = country;
        this.numberOfPersons = numberOfPersons;
    }


    public String getCountry() {
        return country;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    @Override
    public double calculatePremium() {
        premium = 1 * numberOfPersons * DAYS.between(getFrom(), getTo());
        return premium;
    }

    @Override
    public void issue() {

        System.out.println("Travel policy: " + getNumber() + " is prepared for issue");

        super.issue();
    }
}
