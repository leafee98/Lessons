package bistu;

import java.util.ArrayList; 
import java.util.Scanner; 
import java.util.Objects; 

class Student {
    private String StudentNo;
    private String StudentName;

    public Student() {
        this("00", "NULL");
    }
    public Student(String No, String name) {
        this.StudentNo = No;
        this.StudentName = name;
    }
    public boolean equals(Object ob) {
        if (ob instanceof Student) {
            if (((Student)ob).StudentName.equals(this.StudentName) && 
                    ((Student)ob).StudentNo.equals(this.StudentNo)) {
                return true;
            }
        }

        return false;
    }
    public String toString() {
        return "Student{No=" + this.StudentNo + ", Name=" + this.StudentName + "}";
    }
}

class Course {
    private String courseName;
    private int hours;
    private ArrayList<Student> students;

    public Course() {
        this.students = new ArrayList<Student>();
    }
    public Course(String name, int hours) {
        this.courseName = name;
        this.hours = hours;
        this.students = new ArrayList<Student>();
    }
    public Course(String name, int hours, ArrayList<Student> sl) {
        this.courseName = name;
        this.hours = hours;
        this.students = new ArrayList<Student>(sl);
    }
    public void addStudent(Student st) {
        students.add(st);
    }
    public void dropStudent(Student st) {
        for (Student s : this.students) {
            if (s.equals(st)) {
                this.students.remove(s);
            }
        }
        students.remove(st);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course{courseName=" + this.courseName + ", hours=" +
                this.hours + " students=[");
        boolean flag = false;
        for (Student s : this.students) {
            if (flag)
                sb.append(',');
            flag = true;

            sb.append('\n');
            sb.append(s.toString());
        }
        sb.append("]}\n");
        return sb.toString();
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("2017001", "stu1"));
        students.add(new Student("2017002", "stu2"));
        Course c1 = new Course("java", 60);
        Course c2 = new Course("c语言", 80, students);
        Student[] stu = new Student[3];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student("201710" + i, "stu10" + i);
        }
        for (int i = 0; i < stu.length; i++) {
            c1.addStudent(stu[i]);
        }
        System.out.println("请输入要退选Java的学生学号与姓名");
        Scanner input = new Scanner(System.in);
        Student s = new Student(input.next(), input.next());
        System.out.println("\n输出学生退选前的课程信息");
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("\n输出学生退选后的课程信息");
        c1.dropStudent(s);
        System.out.println(c1.toString());
    }
}