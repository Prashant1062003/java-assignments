// Base class
class Parent {
    void display() {
       System.out.println("This is the Parent class.");
    }
 }
 
 // Subclass
 class Child extends Parent {
    @Override
    void display() {
       System.out.println("This is the Child class.");
    }
 }
 
 public class MethodOverriding {
    public static void main(String[] args) {
       Parent obj = new Child(); // Parent reference but Child object
       obj.display(); // Calls the overridden method in Child class
    }
 }
 