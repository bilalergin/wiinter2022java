package day05ifelsestatements;

import java.util.Scanner;

public class ElseIfStatement {



    // Week days : Monday, Tuesday, Wednesday, Thursday, Friday

    // Weekend days: Saturday and Sunday

    // All others are not days

    // if()
    //else if()
    //else



    public static void main(String[] args) {


    //ask the user to give a day

    Scanner scan = new Scanner(System.in);

        System.out.println("Please tell us a day");

        String day = scan.next(); // day => user
                                  // Monday.equals("Monday")
        if(day.equalsIgnoreCase("Monday") ||day.equalsIgnoreCase("Tuesday") ||day.equalsIgnoreCase("Wednesday")
         ||day.equalsIgnoreCase("Thursday") ||day.equalsIgnoreCase("Friday")) {
            System.out.println(day + " is a week day");
        }else if(day.equalsIgnoreCase("Saturday") ||day.equalsIgnoreCase("Sunday")){
            System.out.println(day + " is a weekend day");
        }else {
            System.out.println("This is not a day");
        }

        //first condition => check the week days
        //second condition check the weekend days
        //final condition =>check if it is a day or not




        }



    }

