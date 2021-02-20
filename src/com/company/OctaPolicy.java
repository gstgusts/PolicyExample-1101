package com.company;

import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.DAYS;

public class OctaPolicy extends PolicyBase {

    private int bonusMalus;
    private String vehNumber;

    public OctaPolicy(LocalDateTime from, LocalDateTime to, int bonusMalus, String vehNumber) {
        super(from, to);
        this.bonusMalus = bonusMalus;
        this.vehNumber = vehNumber;
    }

    public int getBonusMalus() {
        return bonusMalus;
    }

    public String getVehNumber() {
        return vehNumber;
    }

    @Override
    public double calculatePremium() {
        premium = 0.5 * bonusMalus * DAYS.between(getFrom(), getTo());
        return premium;
    }

    @Override
    public void issue() {
        System.out.println("Octa policy: " + getNumber() + " is prepared for issue");
        super.issue();
    }
}
