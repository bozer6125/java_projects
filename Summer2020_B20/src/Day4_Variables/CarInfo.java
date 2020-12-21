package Day4_Variables;

import java.time.Year;

public class CarInfo {


    public static void main(String[] args) {

        int year = 2019;
        String brand = "Honda";
        String model = "Civic";
        int mileage = 50000;
        int price = 35000;
        String color = "Black";

        System.out.println("year: "+ year);
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price:" + price);
        System.out.println(year+" "+brand+" "+model+" "+ color + " " + mileage +" miles, $"+price);
    }
}
