package day05_ArithmeticOperators;

public class EmployeeInfo2 {
    public static void main(String[] args) {
        String firstName = "Mehmet";
        String lastName = "Ozer";
        char gender = 'M';
        int age = 29;
        String companyName = "CapitalOne";
        String jobTitle = "DA";
        boolean isFullTime = true;
        boolean isMarried = true;
        double salary = 150000.50;
        String fullName = firstName + " " + lastName;

        System.out.println("Employee' full name is: " + firstName + " " + lastName);
        System.out.println(fullName + "' gender is: " + gender);
        System.out.println(fullName + " " + lastName + "' age is: " + age + "years old");
        System.out.println(fullName + " " + lastName + " works at: " + companyName);
        System.out.println(fullName + " " + lastName + "' title is: " + jobTitle);
        System.out.println(fullName + " " + lastName + "' salary is: " + '$'+ salary);
        System.out.println(fullName + " " + lastName + " is full time employee: " + isFullTime);
        System.out.println(fullName + " " + lastName + "is married: " + isMarried);


    }


    }
