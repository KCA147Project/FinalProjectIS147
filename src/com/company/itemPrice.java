package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class itemPrice {
    public double getItemPrice(int item_id)
    {
        double iPrice;

        switch(item_id){
            case 0  -> {iPrice = 799;} //Ego 56-volt Select Cut
            case 1  -> {iPrice = 1599;} //iPhone 13 Pro Max 1TB
            case 2  -> {iPrice = 547.80;} //T-Rex Skull
            case 3  -> {iPrice = 499;} //Playstation 5
            case 4  -> {iPrice = 5715;} //Tag Heur Monaco 11
            case 5  -> {iPrice = 6099;} //Macbook Pro 16-inch
            case 6  -> {iPrice = 549;} //Airpods Max
            case 7  -> {iPrice = 1599.2;} //Samsung 65"4K Smart TV
            case 8  -> {iPrice = 1699;} //Milwaukee Brushless Combo
            case 9  -> {iPrice = 2399;} //iPad Pro 12.9" 2TB
            case 10  -> {iPrice = 39.99;} //NexiGo Webcam
            case 11  -> {iPrice = 40.98;} //Blurams
            case 12  -> {iPrice = 35.99;} //Occer 12x25 Compact Binoculars
            case 13  -> {iPrice = 39.97;} //Tops Opening Day Baseball Value Pack
            case 14  -> {iPrice = 138.99;} //Retro Typewriter Keyboard 7 Keys
            case 15  -> {iPrice = 35.95;} //Hydro Flask
            case 16  -> {iPrice = 89.99;} //Auking Mini Projector
            case 17  -> {iPrice = 121.63;} //Nike Tech Jacket
            case 18  -> {iPrice = 412;} //Yeezy Boost 350 v2 "bred"
            case 19  -> {iPrice = 59.99;} //Elden Ring
            case 20  -> {iPrice = 99;} //Comfort Carry Portable Locker Pack, 42L
            case 21  -> {iPrice = 39.95;} //AquaSonic Black Series
            case 22  -> {iPrice = 5.99;} //Crest Pro-Health
            case 23  -> {iPrice = 55.98;} //Blue Buffalo Life Protection
            case 24  -> {iPrice = 32.39;} //WEWLINE 17-Inch Tool Box
            case 25  -> {iPrice = 13.80;} //BIC Xtra-Smooth Mechanical Pencils
            case 26  -> {iPrice = 21.99;} //3 Pack (AppleMFi Certified)
            case 27  -> {iPrice = 10.34;} //Amazon Basics Small Digital Alarm Clock
            case 28  -> {iPrice = 76990;} //Tesla Model 3 all Decked out
            case 29  -> {iPrice = 599;} //Meepo V3 electric Skateboard
            default -> {iPrice = 0.0;}
        }

        return iPrice;
    }
}