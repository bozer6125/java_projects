package day07_Unary_ShortHand;

// write a program that can verify if a number is positive, negative, 0
//        Positive_Negative_0
//        Ex:
//            number = 120
//        Output:
//            120 is a positive number? true
//            120 is negative number? false
//            120 ii zero? false
public class verifyNumber {
    public static void main(String[] args) {

    int num =100;
    boolean positive  = num>0;
    boolean negative = num<0;
    boolean zero = num==0;
        System.out.println(num+ " is positive? "+ positive);
        System.out.println(num+ " is negative? "+ negative);
        System.out.println(num+ " is zero? "+ zero);



}
}
