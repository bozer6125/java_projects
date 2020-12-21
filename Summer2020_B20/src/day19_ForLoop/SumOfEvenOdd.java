package day19_ForLoop;

public class SumOfEvenOdd {
    public static void main(String[] args) {

        int sum=0;
        /*
        sum+=2;
        sum+=4;
        ....
         */
        for(int num=0;num<=100; num+=2){
            sum+=num;

        }
        System.out.print(sum);
    }





}
