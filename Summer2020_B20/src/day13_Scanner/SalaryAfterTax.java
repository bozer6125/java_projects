package day13_Scanner;
/* Write a code
needed information
annual salary
state tax rate
federal tax rate
 */
import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
        int salary= input.nextInt();
        System.out.println("Enter your state tax rate: ");
        double stateTaxRate = input.nextDouble();
        double stateTax= salary * stateTaxRate;

        System.out.println("Enter your federal state rate:  ");
        double federalTaxRate = input.nextDouble();// 0.2
        double federalTax= salary* federalTaxRate;
        double salaryAfterTax= salary*federalTaxRate;

        double SalaryAfterTax= salary-stateTax-federalTax;
        System.out.println("Your salary: $"+salary);
        System.out.println("Your states tax: $" +stateTax);
        System.out.println("Federal tax: $"+federalTax);
        System.out.println("Your salary after tax: "+salaryAfterTax);
    }
}
