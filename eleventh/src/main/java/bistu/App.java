package bistu;

import java.util.Scanner;

abstract class Animal {
    private String name;
    protected Animal(String name) {
        this.name = name;
    }
    abstract public String cry();
    @Override
    public String toString() {
        return this.name;
    }
}

class Cat extends Animal {
    private String eyesColor;
    public Cat(String name, String color) {
        super(name);
        this.eyesColor = color;
    }
    public String cry() {
        return "miaomiao!";
    }
    @Override
    public String toString() {
        return "Cat{name=" + super.toString() + 
            ";eyesColor=" + this.eyesColor +
            "}";
    }
}

class Dog extends Animal {
    private String furColor;
    public Dog(String name, String color) {
        super(name);
        this.furColor = color;
    }
    public String cry() {
        return "wangwang!";
    }
    @Override
    public String toString() {
        return "Dog{name=" + super.toString() +
            ";furColor=" + this.furColor +
            "}";
    }
}

class Lady {
    private String name;
    private Animal pet;

    public Lady(String name, Animal pet) {
        this.pet = pet;
        this.name = name;
    }
    public String myPetCry() {
        return "Her pet cry " + pet.cry();
    }
    @Override
    public String toString() {
        return "Lady{name=" + this.name + 
            ", pet=" + this.pet.toString() +
            "};" + this.myPetCry();
    }
}


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println(new Lady(input.next(), (input.next().equals("Cat") ? new Cat(input.next(), input.next()) : new Dog(input.next(), input.next()))));
        input.close();
    }
}
