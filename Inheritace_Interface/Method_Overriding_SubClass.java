package Inheritace_Interface;

public class Method_Overriding_SubClass extends Method_Overriding_SuperClass{
    public static void main(String[] args) {
         Method_Overriding_SubClass dog = new Method_Overriding_SubClass();
        dog.animalSound("DOG");
    }

    @Override
    public String animalSound(String name) {
        super.animalSound("Animal");
        System.out.println(name);
        System.out.println("wuff wuff");
        return name;
    }
    /**
     *
     * the method name is same and parameters doesn't matter here but the body can be different in Method Overriding
     */
    }

