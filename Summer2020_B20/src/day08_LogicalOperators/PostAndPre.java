package day08_LogicalOperators;
//manually calculate the following code fragements:
//                1. int a = 200;//a=199
//                    int b = -a++ + - --a * a-- % 2
//                    int b= -200 + - 200 * 200 %2
//                    int b= -200 - 40000 % 2
//                    int b= -200-0// -200
//                    b = ?
//                2. int x = 300;
//                   int y = 400;
//                   int z = x + y - x * y +x / y;

public class PostAndPre {
    public static void main(String[] args) {
       int a = 200;
        int b = -a++ + - --a * a-- % 2;
        System.out.println(b);
            int x = 300;
            int y = 400;
             int z = x + y - x * y +x / y;
        //int z= 300 + 400 - 300 * 400 + 300 / 400;
        //int z= 300 + 400 - 120000 + 0.7(since it is int take 0)
        //int z= 700-120000+0
        //int z= -119300

        System.out.println(z);


    }
}
