package JahidulAssingments;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        int x = 9;
        int y = 9;
        int sum = x + y;
        System.out.println("the sum of your number is "+ sum);
        if (x < 9){
            System.out.println("x is smaller than 10");
        }
        else if (y > 9){
            System.out.println("Y is greater than 10");
        }
        else {
            System.out.println("X is Equal to 9");
            System.out.println("Y is Equal to 9");
        }
    }
}
