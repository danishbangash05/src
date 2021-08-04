package Methods;

public class ReturnType {
    public static void main(String[] args) {
        ReturnType object = new ReturnType();
        object.calculate(2, 5);
    }

    public int calculate(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
}
