package day07_Unary_ShortHand;

public class shortHand {
    public static void main(String[] args) {
        int a= 5;
        a *= a;
        System.out.println(a);
        int b= 2;
        b*= 3;
        System.out.println(b);
        int c= 300;
        c-=100;
        System.out.println(c);

        System.out.println("===================================");
String schoolName ="Cybertek";
schoolName+= " School";
        System.out.println(schoolName);

String fullName = "Eddie";
fullName += " Murphy";
        System.out.println(fullName);

        System.out.println("===================================");

        // /=
        int budget = 100000;
            budget/=2;
        System.out.println(budget);

//1. Given intz= 198; •verify that the number of z is even number•


    int z = 198;
        z%=2;
        System.out.println(z);
//2.  byte a= 30;•Intb = b+= a;   what’s the value of b ?
        byte k = 30;



    }
}
