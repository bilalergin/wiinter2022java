package day04scannerifstatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {
        //Ask user to enter a day name then
        //print Weekday for Monday, Tuesday, Wednesday, Thursday, Friday
        //print "Weekend Day for Saturday and Sunday

        //Note: To compare 2 Strings do not use "==" it returns wrong result mostly


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day name...");
        String dayName = scan.next();


        //Following code works but it is not professional because there are many repetition

        if(dayName.equals("Monday")){
            System.out.println("Weekday");
        }

        if(dayName.equals("Tuesday")) {
            System.out.println("Weekday");
                    }
        if(dayName.equals("Wednesday)")){
            System.out.println("Weekday");
        }

        if(dayName.equals("Thursday")){
            System.out.println("Weekday");
        }

        if(dayName.equals("Friday")){
            System.out.println("Weekday");
        }

        if(dayName.equals("Saturday")){
            System.out.println("Weekend Day");
        }

        if(dayName.equals("Sunday")){
            System.out.println("Weekend Day");
        }



        //Solve the previous task without repetition
        //Note: In Java, there is Or Operator. OR operator sign is "||".
        //If you use "||", when one is true the result will be true
        if(dayName.equals("Monday") ||dayName.equals("Tuesday") ||dayName.equals("Wednesday") ||dayName.equals("Thursday") ||dayName.equals("Friday")){
            System.out.println("Weekday");

        if(dayName.equals("Saturday") || dayName.equals("Sunday"))
            System.out.println("Weekend Day");
        }
    }
}
