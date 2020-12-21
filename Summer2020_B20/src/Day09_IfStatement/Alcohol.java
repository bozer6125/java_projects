package Day09_IfStatement;

public class Alcohol {

    public static void main(String[] args) {
boolean hasID = true;
int age = 19;
boolean eligible = hasID && age>=21;
//                     true && false ==>false
        if (eligible == true) {
            System.out.println("The person is eligible to buy alcohol");
        }

        if (eligible == false) {
            System.out.println(" The person is not eligible to buy alcohol");
        }




    }


}
