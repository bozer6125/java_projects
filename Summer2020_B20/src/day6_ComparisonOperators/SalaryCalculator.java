package day6_ComparisonOperators;

public class SalaryCalculator {
    public static void main(String[] args) {
     //if: rate = 55;
        //stateTaxRate = 0.04;
        //federalTaxRate =0.22;
        //weeklyHours = 40;
//your salary is: 105600 USD
//your total tax is: 27456 USD
//your income after tax is: 78144 USD
//Salary: rate*weeklyHour*48
//totalTax: salary * (stateTaxRate + federalTaxRate)
        double rate = 48.5;
        double stateTaxRate = 0.04;
        double federalTaxRate =0.22;
        int weeklyHours = 40;
        double salary =rate * weeklyHours * 48;
        double totalTax = salary * (stateTaxRate+federalTaxRate);
        double salaryAfterTax = salary - totalTax;
        System.out.println("your salary is: "+ salary+ "USD");
        System.out.println("your total tax is: " + totalTax+ "USD");
        System.out.println("your income after tax is: " + salaryAfterTax+ "USD");
    }
}
