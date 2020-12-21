package day11_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {
        int num= 100;
        String result="";

        if(num%2==0){
            result="even";
        }else{
            result="odd";
        }
        System.out.println(result);
        System.out.println("===============================");
        String result2=(num%2==0) ? "even" :"odd";

        System.out.println(result2);
        System.out.println("=================================");

    int num1=100;
    int num2=20;
    int max1=0;
    if (num1>num2){
    max1=num1;
        }else{
        max1=num2;
    }
        System.out.println(max1);
    int max2= (num1> num2) ? num1 : num2;
        System.out.println(max2);

        System.out.println("===========================");
int age= 20;
boolean eligible=true;
if (age>=21){

}else{
    eligible=false;
}
        System.out.println(eligible);

        System.out.println("===============================");
        boolean eligible2=(age>=21) ? true: false ;
        System.out.println(eligible2);
    }
}
