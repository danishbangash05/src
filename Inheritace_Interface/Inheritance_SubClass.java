package Inheritace_Interface;

public class Inheritance_SubClass extends Inheritance_SuperClass{
    public static void main(String[] args) {
        Speedup();
        Brakes();
        Horn();
    }
    public static void Brakes(){
        System.out.println("I am Applying Brakes");
    }

    public static void Horn(){
        System.out.println("I am using Horn");
    }

    /**
     *
     * This is the sub-class of the super-class, and it is extended from the super-class carrying all the features from Super-Class.
     * it has two methods and also a main method which.
     */
}
