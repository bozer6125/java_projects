package day12_Switch_Scanner;

    import java.util.Scanner;//imports a specific class
    import java.util.*;// entire class
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your  number");
        // int num1 = input.nextInt();
        //long num2= input.nextLong();
        //System.out.println("you entered "+num2);
        //System.out.println("You entered: "+ num1);
        double num3 = input.nextDouble();
        System.out.println("You entered "+num3);
    }


}
