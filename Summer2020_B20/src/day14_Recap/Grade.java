package day14_Recap;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();

        String result = "";


        if (score >= 0 && score <= 100) {//5possibilities
if(score>=90){
    result="excellent";
}else if(score>=80){
    result="great";
}else if(score>=70){
    result="good";
}else if(score>=60){
    result="passed";
}else{
    result="failed";
}
        } else {//1possible outcome
            result = "Invalid entry";
        }
        System.out.println(result);

    }}