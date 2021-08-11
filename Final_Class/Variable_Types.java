package Final_Class;

public class Variable_Types {
    // Instance variables
    int a = 5;
    int b = 10;
    static int z;

    public static void main(String[] args) {
        int c =20;
        System.out.println(c);
        add();
        z =10;
        System.out.println("Value of z in main method " + z);


    }
    public static void add(){

        // Local variables: it is local to a method (add)
        int c = 5;
        int d = 10;
        z = 20;
        System.out.println("Value of z in add method " + z);
    }
}
