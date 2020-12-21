package day08_LogicalOperators;

public class Logical {
    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String citizenShip = " China";
        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        String fullName = firstName + " "+ lastName;
        System.out.println(eligibleToVote);

        System.out.println(fullName+ " is eligible to vote: "+ eligibleToVote);
    }
}
