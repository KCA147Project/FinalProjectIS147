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


        StateTaxes taxObject = new StateTaxes();
        String state = taxObject.getLocation();
        double taxRate = taxObject.getTax(state);

        System.out.println(taxRate);

        itemprice += itemprice*taxRate;
        System.out.println("Your total is:  " + itemprice);
/*
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