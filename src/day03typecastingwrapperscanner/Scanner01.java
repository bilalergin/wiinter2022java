package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {


    public static void main(String[] args) {

        //Scanner class is used to get data from user in java

        // How we will data from user?
        //1.Step:
        Scanner scan = new Scanner(System.in);

        //2.Step: What do we want from user?
        System.out.println("Enter your age");


        //3.Step: Age
        int age = scan.nextInt();

        System.out.println("The user's age: " + age);

        //4. Step: Name
        System.out.println("Enter your name");
        String name= scan.next();
        System.out.println("The user's name : " + name);


    }







}
