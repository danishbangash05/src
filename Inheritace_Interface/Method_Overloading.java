package Inheritace_Interface;

public class Method_Overloading {
    public static void main(String[] args) {
        /**
         * two or more methods have a same name but different types parameters.
         * You may or may not have same return type.
         * First method has 2 parameters while second method has 3 parameters although variable name is same for both methods.
         *
         */
        Method_Overloading add = new Method_Overloading();
        add.add(4,5);
        add.add(3,4,5);
    }
    public int add (int a, int b){ // first method
        System.out.println(a + b );
        return a + b;
    }
    public void add(int a, int b, int c ){ //Second Method
        System.out.println(a + b + c );
    }
}
