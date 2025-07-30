// Abstract class for Abstraction
abstract class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Abstract method (Abstraction)
    abstract void sound();

    // Concrete method (can be inherited)
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass (Inheritance + Polymorphism)
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    // Method Overriding (Polymorphism)
    @Override
    void sound() {
        System.out.println(name + " says Woof!");
    }
}

// Another Subclass
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    // Method Overriding (Polymorphism)
    @Override
    void sound() {
        System.out.println(name + " says Meow!");
    }
}

// Main class to use the objects
public class oops{
    public static void main(String[] args) {
        // Creating objects (Object & Class)
        Animal myDog = new Dog("Bruno");
        Animal myCat = new Cat("Luna");

        // Polymorphism in action
        myDog.sound();
        myDog.sleep();

        myCat.sound();
        myCat.sleep();
    }
}