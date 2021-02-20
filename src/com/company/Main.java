package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       //var d30 = Period.of(0, 1,4);

	   var octaPolicy1 = new OctaPolicy(LocalDateTime.now(),
               LocalDateTime.now().plusMonths(1), 1, "HJK");

	   var kaskoPolicy1 = new KaskoPolicy(LocalDateTime.now(),
               LocalDateTime.now().plusMonths(1),25, 10);

        List<PolicyBase> policies = new ArrayList<>(Arrays.asList(octaPolicy1, kaskoPolicy1));

        for (var policy :
                policies) {
            System.out.println(policy.calculatePremium());
            policy.issue();
        }
    }
}
