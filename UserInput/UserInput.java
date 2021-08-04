package UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int id;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your firstname");
        firstName = sc.next();

        System.out.println("Enter your lastName");
        lastName = sc.next();

        System.out.println("Enter your id #");
        id = sc.nextInt();

        System.out.println("You have Entered: ");
        System.out.println("***********************");
        System.out.println("firstname: "+firstName);
        System.out.println("lastname:  " + lastName);
        System.out.println("id: " + id);
        System.out.println("***********************");
    }
}
