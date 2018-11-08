package bistu;

abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    abstract public String cry();
    public String toString() {
        return this.name;
    }
}

class Lady {
    private String name;
    private Animal pet;

    public Lady(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }
    public String myPetCry() {
        return pet.cry();
    }
    public String toString() {
        return "Lady{name=" + this.name + ",pet=" +
            ((pet instanceof Cat) ? ((Cat)pet).toString() : ((Dog)pet).toString()) +
            "}";
    }
}

class Cat extends Animal {
    private String eyesColor;
    
    public Cat(String name, String color) {
        super(name);
        this.eyesColor = color;
    }
    public String cry() {
        return "miaomiao...}";
    }
    public String toString() {
        return "Cat{name=" + super.toString() + ";eyesColor=" + this.eyesColor + "}";
    }
}

class Dog extends Animal {
    private String furColor;

    public Dog(String n, String color) {
        super(n);
        this.furColor = color;
    }
    public String cry() {
        return "wangwang...}";
    }
    public String toString() {
        return "Dog{name=" + super.toString() + ";furColor=" + this.furColor + "}";
    }
}

public class TestLady{

    public static void main(String[] args){

        Cat cat = new Cat("jack","blue");

        Dog dog = new Dog("jerry","black");

        Lady[] ladys ={ new Lady("wang",cat),new Lady("zhang ",dog)};

        for(Lady lady:ladys)

           System.out.println(lady+ ";Her pet cry  "+lady.myPetCry());

      }

}