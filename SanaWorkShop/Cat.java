package SanaWorkShop;

public class Cat extends Animal{
        public void speak(){
            System.out.println("I can speak");
            System.out.println("I make meow sound");
        }
        public void eat(){
            System.out.println("I can eat");
        }
        public static void main(String[]args){

            Cat c=new Cat();
            c.intro();
            c.speak();
            c.eat();
        }
}
