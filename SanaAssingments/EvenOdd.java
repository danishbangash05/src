package SanaAssingments;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {


        /**
         * take a number from a user and verify if the number is even or odd
         */
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number...");
        x = sc.nextInt();

        if(x % 2 == 0 ){
            System.out.println("you have entered an even number");

        }else if(x % 2 == 1) {
            System.out.println("You have entered an odd number");
        }
    }
}