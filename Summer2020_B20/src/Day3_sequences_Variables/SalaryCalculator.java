package Day3_sequences_Variables;
/*
task:       100000, 0.28
variables :salary, tax;
 */

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary =150000;
        double tax = 0.28;
        double totalTax = (salary * tax);//28000
        double salaryAfterTax = salary - totalTax;//72000

        System.out.println(salaryAfterTax);




    }

}
