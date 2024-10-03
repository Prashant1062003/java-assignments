// Base class
class Animal {
    void eat() {
       System.out.println("This animal eats food.");
    }
 }
 
 // Subclass 1
 class Mammal extends Animal {
    void walk() {
       System.out.println("This mammal walks on land.");
    }
 }
 
 // Subclass 2
 class Dog extends Mammal {
    void bark() {
       System.out.println("The dog barks.");
    }
 }
 
 public class MultilevelInheritance {
    public static void main(String[] args) {
       Dog dog = new Dog();
 
       // Calling methods from different levels of inheritance
       dog.eat();   // Method from Animal class
       dog.walk();  // Method from Mammal class
       dog.bark();  // Method from Dog class
    }
 }
 