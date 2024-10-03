// Abstract class
abstract class AbstractClass {
    // Abstract method (no body)
    abstract void display();
 
    // Concrete method
    void show() {
       System.out.println("This is a concrete method in the abstract class.");
    }
 }
 
 // Concrete class 1
 class ConcreteClass1 extends AbstractClass {
    @Override
    void display() {
       System.out.println("Display method implemented in ConcreteClass1.");
    }
 }
 
 // Concrete class 2
 class ConcreteClass2 extends AbstractClass {
    @Override
    void display() {
       System.out.println("Display method implemented in ConcreteClass2.");
    }
 }
 
 public class AbstractClassExample {
    public static void main(String[] args) {
       // Creating objects of concrete classes
       AbstractClass obj1 = new ConcreteClass1();
       AbstractClass obj2 = new ConcreteClass2();
 
       // Calling the implemented methods
       obj1.display();
       obj1.show();
 
       obj2.display();
       obj2.show();
    }
 }
 