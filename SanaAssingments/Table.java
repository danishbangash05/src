package SanaAssingments;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int user;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        user = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            // 2 * 1 = 2
            System.out.println(user+ " * " + i + " = " + user * i);
            System.out.println("----------");
        }

    }
}