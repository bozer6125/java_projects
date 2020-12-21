package day13_Scanner;

import java.util.Scanner;

public class nextline_VS_nextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Enter
        System.out.println("Enter your salary: ");
        double salary= scan.nextDouble();//120000
scan.nextLine();//we  use this to take out the enters that are left in the scanner. so that we can use the next line method
        System.out.println("Enter your full name: ");
        String fullName= scan.nextLine();

        System.out.println("Salary: "+ salary);
        System.out.println("fullName: "+ fullName);


    }
}
