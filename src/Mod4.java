import java.util.*;

public class Mod4 {

    public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);
        double cal1 = 0;
        double cal2 = 0;
        double cal3 = 0;
        double cal4 = 0;
        double cal5 = 0;
        double input5 = 0;

        while(input5 ==0) {
            System.out.println("Enter five decimal numbers between 1 and 6 digits");
            double input1 = scnr.nextDouble();
            //cal1 = input1;
            double input2 = scnr.nextDouble();
            cal2 = input2;
            double input3 = scnr.nextDouble();
            cal3 = input3;
            double input4 = scnr.nextDouble();
            cal4 = input4;
            input5 = scnr.nextDouble();
            cal5 = input5;

        }
        double total= cal1 + cal2 + cal3 + cal4 + cal5;
        double interest = total * 0.20;
        String str;
        //str = String.format("If this was credit card debt at 20% interest you would pay: %.2g%n in interest per year", interest );
        System.out.println("The total of your input is: " + (cal1 + cal2 + cal3 + cal4 + cal5)); //Total
        System.out.println((cal1 + cal2 + cal3 + cal4 + cal5) / 5);//Avg
        System.out.println(Math.max(Math.max (Math.max(Math.max(cal4, cal5), cal3), cal2), cal1)); //Max
        System.out.println(Math.min(Math.min (Math.min(Math.min(cal4, cal5), cal3), cal2), cal1)); //Min
        System.out.println( "If this was credit card debt at 20% interest you would pay: " + interest + " in interest per year");
        }
    }

