package com.company;

import java.util.*;

interface taxRate{
    public String getLocation();
    public double getTax(String locationName);
}

public class StateTaxes implements taxRate{
    public StateTaxes() {
    }

    public String getLocation() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your State Abbreviation in CAPS (e.g. CA): ");
        String locationName = input.nextLine();

        return locationName;
    }

    public double getTax(String locationName) {
        double tax = 0.0;
        switch (locationName) {
            case "AL", "GA", "HI", "NY", "WY" -> {
                tax = 0.04;
                break;
            }
            case "AK", "DE", "MT", "NH", "OR" -> {
                tax = 0.00;
                break;
            }
            case "AZ" -> {
                tax = 0.056;
                break;
            }
            case "AR", "KS", "WA" -> {
                tax = 0.065;
                break;
            }
            case "CA" -> {
                tax = 0.0725;
                break;
            }
            case "CO" -> {
                tax = 0.029;
                break;
            }
            case "CT" -> {
                tax = 0.0635;
                break;
            }
            case "DC", "FL", "ID", "IA", "KY", "MD", "MI", "PA", "SC", "VT", "WV" -> {
                tax = 0.06;
                break;
            }
            case "IL", "MA", "TX" -> {
                tax = 0.0625;
                break;
            }
            case "IN", "MS", "RI", "TN" -> {
                tax = 0.07;
                break;
            }
            case "LA" -> {
                tax = 0.0445;
                break;
            }
            case "ME", "NE" -> {
                tax = 0.055;
                break;
            }
            case "MN" -> {
                tax = 0.0688;
                break;
            }
            case "MO" -> {
                tax = 0.0423;
                break;
            }
            case "NV" -> {
                tax = 0.0685;
                break;
            }
            case "NJ" -> {
                tax = 0.0663;
                break;
            }
            case "NM" -> {
                tax = 0.0513;
                break;
            }
            case "NC" -> {
                tax = 0.0475;
                break;
            }
            case "ND" -> {
                tax = 0.05;
                break;
            }
            case "OH" -> {
                tax = 0.0575;
                break;
            }
            case "OK" -> {
                tax = 0.045;
                break;
            }
            case "SD" -> {
                tax = 0.045;
                break;
            }
            case "UT" -> {
                tax = 0.061;
                break;
            }
            case "VA" -> {
                tax = 0.053;
                break;
            }
            case "WI" -> {
                tax = 0.05;
                break;
            }
            default ->
                tax = 0.0;
        }
        return tax;
    }
}