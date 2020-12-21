package day07_Unary_ShortHand;

public class leapYear {
       //  year = 2020  ==> short;
        //            LeapYear =true/false;
        //        output:
        //            2020 is leap year: true
       public static void main(String[] args) {

int year =2040;
boolean result = year %4 ==0;

           System.out.println(year+ " is a leap year: "+ result);//2021 is not a leap year: false


       }
}
