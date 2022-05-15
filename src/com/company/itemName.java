package com.company;

import java.util.*;

public class itemName {
    public void displayItemMenu() {
        System.out.println("Enter the item numbers you would like to purchase: ");
        System.out.println("----------------------------------------");

        System.out.println("ELECTRONICS:");
        System.out.println("#0 - Electric Lawn Mower $799.00");
        System.out.println("#1 - iPhone $1,599.00");
        System.out.println("#3 - Game Console $499.00");
        System.out.println("#4 - Automatic Watch $5,715.00");
        System.out.println("#5 - Laptop $6,099.00");
        System.out.println("#6 - AirPods Max $549.00");
        System.out.println("#7 - TV $529.00");
        System.out.println("#9 - Tablet $2,399.00");
        System.out.println("#10 - Beats Headphones $129.95");
        System.out.println("#11 - Security Camera $40.98");
        System.out.println("#14 - Electronic Retro Type Writer $138.99");
        System.out.println("#16 - Projector $89.99");
        System.out.println("#19 - Video Game $59.99");
        System.out.println("#26 - iPhone Charger $21.99");
        System.out.println("#27 - Alarm Clock $10.34");
        System.out.println("#28 - Tesla Model 3 $76,990.00");
        System.out.println("#29 - Electronic Skateboard $599.00");

        System.out.println("------------------------------");
        System.out.println("CLOTHING:");
        System.out.println("#17 - Jacket $121.63");
        System.out.println("#18 - Yeezy 350 Sneakers $412.00");
        System.out.println("#20 - Back Pack $99.00");

        System.out.println("------------------------------");
        System.out.println("HOUSEHOLD ITEMS:");
        System.out.println("#8 - Tool Combo $1,699.00");
        System.out.println("#15 - Water Bottle $35.95");
        System.out.println("#21 - Toothbrush $39.95");
        System.out.println("#22 - Toothpaste $5.99");
        System.out.println("#23 - Dog Food $55.98");
        System.out.println("#24 - Tool Box $32.39");
        System.out.println("#25 - Mechanical Pencils $13.80");

        System.out.println("------------------------------");
        System.out.println("GIFT ITEMS:");
        System.out.println("#2 - Dinosaur Skull $547.80 ");
        System.out.println("#12 - Binoculars $35.99");
        System.out.println("#13 - Baseball Cards $39.97");
        System.out.println("------------------------------");
    }

    public int enterItemId() {
        Scanner name = new Scanner(System.in);
        int item_id = name.nextInt();
        return item_id;
    }
}
