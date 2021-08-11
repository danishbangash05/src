package Inheritace_Interface;

public abstract class Interface_PreClass implements Interface {
    /**
     * Abstract class will implement methods from an interface
     * Abstract class must have at least one abstract method
     * what is abstract methods ?
     *
     */
    @Override
    public void animalSound(){
        System.out.println("Animals can make different sounds");
    }

    @Override
    public void eat(){
        System.out.println("All animals eat different food");
    }
    public abstract void sleep();
}
