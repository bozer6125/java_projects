package Day09_IfStatement;

public class Medium {
    // 3. write a java program that accepts three numbers and rteurn the mediam number
    //                (assume that none of them are equal)

    public static void main(String[] args) {
        double a=100;
        double b=200;
        double c=300;
boolean aIsMedium = (a>b && a<c) || (a>c && a<b);
boolean bIsMedium = (b<c && b>a) || (b>c && b<a);
boolean cIsMedium = (c>a && c<b) || (c>b && c<a);

        double medium=0;

        if(aIsMedium){
            //System.out.println(a);
            medium= a;
        }
    if (bIsMedium){
       // System.out.println(b);
        medium= b;
    }
    if (cIsMedium){
        //System.out.println(c);
        medium=c;
    }
        System.out.println(medium+ " is medium number");
    }
}
