import java.text.NumberFormat;
import java.util.Scanner;

public class itemPrice {
    {

        Scanner input = new Scanner(System.in);
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();

        System.out.println("Enter First Item: ");
        String purchase = input.nextLine();
        double item = 0.00;
        double item1, total;



        switch(purchase){
            case "0" -> {item = 799;} //Ego 56-volt Select Cut
            case "1" -> {item = 1599;} //iPhone 13 Pro Max 1TB
            case "2" -> {item = 547.80;} //T-Rex Skull
            case "3" -> {item = 499;} //Playstation 5
            case "4" -> {item = 5715;} //Tag Heur Monaco 11
            case "5" -> {item = 6099;} //Macbook Pro 16-inch
            case "6" -> {item = 549;} //Airpods Max
            case "7" -> {item = 1599;} //Samsung 65"4K Smart TV
            case "8" -> {item = 1699;} //Milwaukee Brushless Combo
            case "9" -> {item = 2399;} //iPad Pro 12.9" 2TB
            case "10" -> {item = 39.99;} //NexiGo Webcam
            case "11" -> {item = 40.98;} //Blurams
            case "12" -> {item = 35.99;} //Occer 12x25 Compact Binoculars
            case "13" -> {item = 39.97;} //Tops Opening Day Baseball Value Pack
            case "14" -> {item = 138.99;} //Retro Typewriter Keyboard 7 Keys
            case "15" -> {item = 35.95;} //Hydro Flask
            case "16" -> {item = 89.99;} //Auking Mini Projector
            case "17" -> {item = 121.63;} //Nike Tech Jacket
            case "18" -> {item = 412;} //Yeezy Boost 350 v2 "bred"
            case "19" -> {item = 59.99;} //Elden Ring
            case "20" -> {item = 99;} //Comfort Carry Portable Locker Pack, 42L
            case "21" -> {item = 39.95;} //AquaSonic Black Series
            case "22" -> {item = 5.99;} //Crest Pro-Health
            case "23" -> {item = 55.98;} //Blue Buffalo Life Protection
            case "24" -> {item = 32.39;} //WEWLINE 17-Inch Tool Box
            case "25" -> {item = 13.80;} //BIC Xtra-Smooth Mechanical Pencils
            case "26" -> {item = 21.99;} //3 Pack (AppleMFi Certified)
            case "27" -> {item = 10.34;} //Amazon Basics Small Digital Alarm Clock
            case "28" -> {item = 76990;} //Tesla Model 3 all Decked out
            case "29" -> {item = 599;} //Meepo V3 electric Skateboard
        }



        System.out.println("Quantity: ");
        item1 = input.nextInt();

        total = item * item1;



        System.out.println(fmt1.format(total));


    }
}