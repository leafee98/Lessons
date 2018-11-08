package bistu;

abstract class Animal {
      abstract public String cry();
}

interface Edible {
      public String howToEat();
}

abstract class Fruit implements Edible {
}

class Apple extends Fruit {
      public String howToEat() {
            return "Apple{直接食用}";
      }
}

class Orange extends Fruit {
      public String howToEat() {
            return "Orange{打成果汁}";
      }
}

class Chicken extends Animal implements Edible {
      public String howToEat() {
            return "Chicken{煎一下}";
      }
      public String cry() {
            return "Chicken{gugu}";
      }
}

class Tiger extends Animal {
      public String cry() {
            return "Tiger{wouwou}";
      }
}

public class TestEdible {

   public static void main(String[] args){

        Object[] objects = {new Tiger(), new Chicken(), new Apple(),new Orange()};

        System.out.println("输出所有食品的食用方法：");

        for(Object obj:objects){

              if (obj instanceof Edible)

                    System.out.println(((Edible)obj).howToEat());   

          }

        System.out.println("\n输出所有动物的叫声：");

        for(Object obj:objects){

             if (obj instanceof Animal)

                  System.out.println(((Animal)obj).cry());

          }

    }

}
