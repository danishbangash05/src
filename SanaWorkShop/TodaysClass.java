package SanaWorkShop;

import java.sql.PreparedStatement;
//**


public class TodaysClass {
    public static void main(String[] args) {
        TodaysClass obj = new TodaysClass();
        obj.sum(2 , 4, 6);
        obj.sum(3, 5);
    }
    public void sum(int num1, int num2){
        int answer=num1+num2;
        System.out.println("Answer of 2 number is: " +answer);
    }
    public void sum(int num1, int num2, int num3){
        int answer=num1+num2+num3;
        System.out.println("Answer of 3 number is: " +answer);
    }
}
