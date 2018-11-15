package bistu;

import java.util.Scanner;

interface Volunteer {
    public abstract String volunteer(String organization);
}

class Person {
    private String name;
    public Person() {
        name = "";
    }
    public Person(String name) {
        this.name = name;
    }
    public String toString() {
        return "姓名" + this.name;
    }
}

class Student extends Person implements Volunteer {
    private int grade;
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }
    public String volunteer(String organization) {
        return organization;
    }
    public String toString() {
        return super.toString() + "\n年级" + this.grade + '\n';
    }
}



public class Test{ 
  public static void main(String[] args){ 
     Scanner input = new Scanner(System.in); 
     String name=input.next(); 
     int grade=input.nextInt(); 
     String organization=input.next();     
     Student student = new Student(name,grade);   
    System.out.println(student + "所属社团" + student.volunteer(organization) + "\n"); 
   } 
}