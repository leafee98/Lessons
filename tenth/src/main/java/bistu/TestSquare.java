package bistu;

import java.util.Scanner;

class Square {
      private double edge;

      public Square(double edge) {
            this.edge = edge;
      }

      public Square() {
            this(0);
      }

      public double getArea() {
            return this.edge * this.edge;
      }

      public static void sortByArea(Square[] data) {
            Square temp;
            for (int i = 0; i < data.length - 1; ++i) {
                  for (int j = 0; j < data.length - 1 - i; ++j) {
                        if (data[j].getArea() > data[j + 1].getArea()) {
                              temp = data[j];
                              data[j] = data[j + 1];
                              data[j + 1] = temp;
                        }
                  }
            }
      }
}

public class TestSquare {
      public static void main(String[] args) {
            Square[] data = new Square[5];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < data.length; i++) {
                  data[i] = new Square(input.nextInt());
            }
            System.out.println("数组原顺序：");
            for (Square squ : data)
                  System.out.println(squ.getArea());

            System.out.println("升序排序后：");
            Square.sortByArea(data);
            for (Square squ : data)
                  System.out.println(squ.getArea());
      }
}