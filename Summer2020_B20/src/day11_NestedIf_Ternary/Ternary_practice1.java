package day11_NestedIf_Ternary;

public class Ternary_practice1 {
    public static void main(String[] args) {
        int age = 23;
        String citizen = "USA";
        String result = " ";
        if (age >= 18 && citizen == "USA") {
            System.out.println("Can Vote");
        } else {
            System.out.println("Can not Vote");
        }
        System.out.println(result);


    String result2 = (age >= 18 && citizen == "USA") ? "Can Vote" : "Can not Vote";
        System.out.println(result2);
int n1=100;
int n2=200;
String r=(n1==n2)?"Equal":"Not Equal";
        System.out.println(r);

        System.out.println("========================");
    }
}