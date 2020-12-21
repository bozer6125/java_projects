package Day09_IfStatement;

public class Vote {
    public static void main(String[] args) {
        boolean usCitizen= true;
        int age = 21;

        if (age>=18 && usCitizen){
            System.out.println("The person is eligible to Vote");
        }else
            System.out.println("the person is not eligible to Vote");

        }


    }


