package day05ifelsestatements;

import java.util.Scanner;

public class IfElseStatement03 {
    public static void main(String[] args) {

// ask user to type the weather sunny / rainy

Scanner scan = new Scanner(System.in);

        System.out.println("Please tell us the weather if it is 'sunny' or 'rainy'");

        String weather = scan.next();


        //when we compare two Strings, we use equals() method

        //equalsIgnoreCase


        if(weather.equalsIgnoreCase("sunny")){
            System.out.println("We can go shopping");
        } else {
            System.out.println("we cannot go out today");





    }


} }
