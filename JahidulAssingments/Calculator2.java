package JahidulAssingments;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number");
        x = sc.nextInt();

        System.out.println("Enter your Second Number");
        y = sc.nextInt();

        System.out.println("You have Entered: ");
        System.out.println("***********************");
        System.out.println("First Number: "+ x);
        System.out.println("Second Number:  " + y);
        System.out.println("Sum: " + (x+y));
        System.out.println("***********************");
    }
}
