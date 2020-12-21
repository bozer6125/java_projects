package day07_Unary_ShortHand;



public class post_Vs_Pre {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);//11
        System.out.println(a);//11


        System.out.println("==================================");

        int b= 10;
        System.out.println(b++);//10
        System.out.println(b);//11

        System.out.println("===================================");

        int c = 25;
        int d = c++; //d= 25;
        //c=26
        System.out.println(c);
        System.out.println(d);
        System.out.println("===================================");

        int x = 8;
        int y = x--;//y= 8 x= 7

        System.out.println(x);
        System.out.println(y);
        System.out.println("===================================");

        int A= 1;
          A= -A-- + A++/ -A-- * --A;
        //A= -1   +  1/ -1    *  -1
//A= -1

        System.out.println("===================================");
        int B =50;  // B= 49 + 50 + 49 +49;
        B= --B + B++ + B-- + B++;//49
     // B= 49
        //a= 49 +49 + 50 +49 ;//197


        System.out.println(B);
        System.out.println("===================================");





    }
}
