import java.util.*;

public class Mod4 {

    public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);
        double input1 = 0;
        double input2 = 0;
        double input3 = 0;
        double input4 = 0;
        double input5 = 0;

        while(input5 == 0) {
            System.out.println("Enter five decimal numbers between 1 and 6 digits");
            input1 = scnr.nextDouble();
            input2 = scnr.nextDouble();
            input3 = scnr.nextDouble();
            input4 = scnr.nextDouble();
            input5 = scnr.nextDouble();


        }
        double total= input1 + input2 + input3 + input4 + input5;
        double interest = total * 0.20;
        String string = String.format("20%s interest on this total would be : %.2f", "%", interest);
        System.out.println("The total of your input is: " + (input1 + input2 + input3 + input4 + input5));   //Total
        System.out.println((input1 + input2 + input3 + input4 + input5) / 5);                                //Avg
        System.out.println(Math.max(Math.max (Math.max(Math.max(input4, input5), input3), input2), input1)); //Max
        System.out.println(Math.min(Math.min (Math.min(Math.min(input4, input5), input3), input2), input1)); //Min
        //System.out.println( "If this was credit card debt at 20% interest you would pay: " + interest + " in interest per year");//interest
        System.out.println(string);
        }
    }

