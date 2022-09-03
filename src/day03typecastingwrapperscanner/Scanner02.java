package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");

        String fullName = scan.nextLine();//to get String data from user use nextline() method

        System.out.println("The user's name is " + fullName);

    }


}
