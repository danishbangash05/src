package Inheritace_Interface;

public class Interface_Class extends Interface_PreClass{
    public static void main(String[] args) {
        Interface_Class Cat = new Interface_Class();
        Cat.animalSound();
        Cat.eat();
        Cat.sleep();
    }
    /**
     * Interface can only be implemented
     * Abstract class can be extend
     * Actual class can be extend
     */
    @Override
    public void sleep(){
        System.out.println("All animals can sleep");
    }
}
