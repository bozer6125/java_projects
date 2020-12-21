package Day09_IfStatement;

public class Minimum {
    //2. write a java program that accepts three numbers and return the minimum number
    //                (assume that none of them are equal)

    public static void main(String[] args) {
        double a= 100;
        double b= 5;
        double c= 300;
        boolean aIsMin =a<b && a<c;
        boolean bIsMin =b<a && b<c;
        boolean cIsMin =c<a && c<b;
        double min = 0;  // we want to assign the minimum number to variable max

        if(aIsMin){
            //System.out.println(a);
            min=a;
        }
        if (bIsMin){
          //  System.out.println(b);
            min=b;
        }
        if (cIsMin){
            //System.out.println(c);
            min=c;
        }

        System.out.println(min +" is minimum number");

    }
}
