package com.company;

import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {


//_____________________________________________________________________________________________________________________
        //ARRAY ITEM NAME CLASS
        itemName name = new itemName();
        name.displayItemMenu();
        int item_id = name.enterItemId();

//_____________________________________________________________________________________________________________________
        //ARRAY ITEM PRICE CLASS

        //ArrayList<String>itemPrice = new ArrayList();
        itemPrice thePrice = new itemPrice();
        double itemprice = thePrice.getItemPrice(item_id);

        System.out.println(itemprice);

/*
//_____________________________________________________________________________________________________________________
        //NUMBERS CLASS
        double Maryland = 0.06;
        new StateTaxes();
        int num1,num2,num3,num4,num5,num6;
        int item1, item2, item3, item4, item5, item6;
        double subtotal, tax, totalCost;
        double firstTotal, secondTotal, thirdTotal, fourthTotal, fifthTotal, sixthTotal, finalTotal;


        Scanner scan = new Scanner (System.in);

        NumberFormat fmt1 = NumberFormat.getCurrencyInstance ();
        NumberFormat fmt2 = NumberFormat.getPercentInstance ();
//_____________________________________________________________________________________________________________________


        //NAME (QUESTION)
        //Scanner input = new Scanner(System.in);

        StateTaxes taxObject = new StateTaxes();
        String state = taxObject.getLocation();
        double taxRate = taxObject.getTax(location);


        //EMPLOYEE ID
        Scanner employeeId = new Scanner(System.in);


        System.out.print ("Employee ID: ");
        String value2 = employeeId.nextLine();

        //SIX ITEMS
        System.out.println ("Select First Item: ");
        num1 = scan.nextInt();
        System.out.println ("Quantity: ");
        item1 = scan.nextInt();

        System.out.println ("Select Second Item: ");
        num2 = scan.nextInt();
        System.out.println ("Quantity: ");
        item2 = scan.nextInt();

        System.out.println ("Select Third Item: ");
        num3 = scan.nextInt();
        System.out.println ("Quantity: ");
        item3 = scan.nextInt();

        System.out.println ("Select Fourth Item: ");
        num4 = scan.nextInt();
        System.out.println ("Quantity: ");
        item4 = scan.nextInt();

        System.out.println ("Select Fifth Item: ");
        num5 = scan.nextInt();
        System.out.println ("Quantity: ");
        item5 = scan.nextInt();

        System.out.println ("Select Sixth Item: ");
        num6 = scan.nextInt();
        System.out.println ("Quantity: ");
        item6 = scan.nextInt();



        firstTotal = num1 * item1;
        secondTotal = num2 * item2;
        thirdTotal = num3 * item3;
        fourthTotal = num4 * item4;
        fifthTotal = num5 * item5;
        sixthTotal = num6 * item6;


        subtotal = (firstTotal + secondTotal + thirdTotal + fourthTotal + fifthTotal + sixthTotal);
        tax = subtotal * Maryland;
        totalCost = subtotal + tax;


//_____________________________________________________________________________________________________________________
        //OUTPUT
        System.out.println ("\n" + line2);

        System.out.println("              Atkinson Shields \n              Stine & Partners");
        System.out.println("\n               Store # 094254");
        System.out.println("       1000 Hilltop Cir ITE Building \n     Baltimore MD 21250" + " (410) 455-1000");
        System.out.println(dtf.format(now) +" | " + "EMPLOYEE ID: " + value2 );
        //System.out.println("\n");

        System.out.println ("\nState: "   ); //STATE
        System.out.printf ("State Tax: " + "%.2f%%\n", Maryland); //STATE TAX

        System.out.println ("\n" + line);
        System.out.println(tableHeader.get(0) + "  |  " + tableHeader.get(1) + "  |  " + tableHeader.get(2)+ "  |  " + tableHeader.get(3));
        System.out.println("====" +  "     " + "===" +  "     " + "=====" +  "     " + "=====");

        System.out.println(firstTotal + "      " + item1);
        System.out.println(secondTotal + "  " + item2);
        System.out.println(thirdTotal + "  " + item3);
        System.out.println(fourthTotal + "  " + item4);
        System.out.println(fifthTotal + "  " + item5);
        System.out.println(sixthTotal + "  " + item6);


        System.out.println ("SUBTOTAL:         " + fmt1.format (subtotal)); //SUBTOTAL

        System.out.println ("TAX:          " + fmt1.format (tax)); //TAX PAID

        System.out.println ("Total:             " + fmt1.format (totalCost)); //TOTAL WITH TAX CALCULATED

        System.out.println (line);

        System.out.println(itemList.get(0) + "       " + fmt1.format(itemprice[0]));
        System.out.println(itemList.get(18) + "       " + fmt1.format(itemprice[18]));
*/
    }
}

/*
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy | HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String line = new String(new char[48]).replace('\0', '_');
        String line2 = new String(new char[48]).replace('\0', '*');
 */