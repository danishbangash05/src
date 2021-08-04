package ConditionalStatements;
import java.util.Scanner;
public class AgeVerifier {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        age = sc.nextInt();

        if (age < 18 ){
            System.out.println("You can not sign up");

        }else if (age > 18) {
            System.out.println("Welcome to facebook");

        }else if(age > 65){
            System.out.println("Too old for facebook");
        }

    }
}