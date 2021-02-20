package com.company;

import java.time.LocalDateTime;

public abstract class PolicyBase {
    private String number;
    protected double premium;
    private LocalDateTime from;
    private LocalDateTime to;

    public PolicyBase(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
        this.number = "";
        this.premium = 0;
    }

    public String getNumber() {
        return number;
    }

    public double getPremium() {
        return premium;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public String print() {
        return "";
    }

    public void issue() {
        System.out.println("POLICY:" + number + " is issued");
    }

    public abstract double calculatePremium();

    public void setPremium(double premium) {
        this.premium = premium;
    }
}
