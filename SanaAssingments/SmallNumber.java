package SanaAssingments;

import java.util.Scanner;

public class SmallNumber {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        System.out.println("You have entered: " + x +" "+ y + " "+ z);

        if(x<y && x<z){
            System.out.println(x + " is the smallest number");
        } else if (y>x && y<z){
            System.out.println(y + " is the smallest number");
        } else {
            System.out.println(z + " is the smallest");
        }
    }
}