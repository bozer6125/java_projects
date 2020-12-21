package day15_String;

import java.util.Scanner;
import java.lang.String;
public class String_Intro {
    public static void main(String[] args) {
        String str="Cybertek";
        Scanner input= new Scanner(System.in);

        String name= "Cybertek";//string literal
        String name2= new String("Cybertek");

        String s1="Cat"; //string literal
        String s2="Cat"; //string literal

        System.out.println(s1==s2);

        String d1="Dog"; //string literal
        String d2="dog"; //string literal
        System.out.println(d1==d2);

        String t1= new String("Tiger");
        String t2= new String("Tiger");

        System.out.println(t1==t2);

        String c1="Cyberytek";
        String c2=new String("Cybertek");
        System.out.println(c1==c2);//false they are diffretent objects


    }
}
