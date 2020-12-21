package day15_String;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        String name="Cybertek School is a great place";
        char ch1= name.charAt(0);
        char ch2= name.charAt(5);
        System.out.println(ch1);
        System.out.println(ch2);

        //length()==>int
        //last index number=length of string -1
        int lastIndexNumber=name.length()-1;
        System.out.println(lastIndexNumber);
        char lastChar= name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        //concat(str):
        String schoolName="Cybertek";
        schoolName= schoolName.concat(" School");

        System.out.println(schoolName);


        //toLowerCase();
        String name1="CYBERTEK SCHOOL";
        name1=name1.toLowerCase();                //"cybertek school"
        System.out.println(name1);


        //toUpperCase();
        String name2= "beyza";
        name2=name2.toUpperCase();
        System.out.println(name2);

        //trim();
        String p="       Cybertek School       ";
        p=p.trim();
        System.out.println(p);



        }
    }








