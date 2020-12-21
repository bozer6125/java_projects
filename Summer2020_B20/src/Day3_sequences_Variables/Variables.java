package Day3_sequences_Variables;
/*
declare variables:
            DataType variableName = Data;
 */
public class Variables {
    public static void main(String[] args) {
     //length: 2, width: 4, area: 8

      byte length = 20;
      byte width = 40;
        System.out.println(2*4);
        System.out.println(length * width);

        byte num1 = 12; //it gives compile error because it is larger than 127, byte number can not be larger than 127
        short num2 = 140; //it should be short variable

        short salary = 4000; //gave compile error
        int salary2 = 40000;
        double PI = 3.14;

    }

}
