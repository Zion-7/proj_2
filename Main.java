package main;
import java.util.ArrayList;
import java.util.Scanner;

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class College {
    private String name;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public College(String name, ArrayList<Student> students, ArrayList<Teacher> teachers) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
}
class Student {
    private String name;
    private int id;
    private int grade;
    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("COLLEGE NAME");
        String collegeName = scan.nextLine();
        System.out.println("ENTER THE NUMBER OF STUDENTS");
        int numStudents = scan.nextInt();
        scan.nextLine(); // Consume the newline character
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("ENTER STUDENT " + i + " NAME: ");
            String name = scan.nextLine();
            System.out.print("ENTER STUDENT " + i + " ID: ");
            int id = scan.nextInt();
            scan.nextLine(); // Consume the newline character
            System.out.print("ENTER STUDENT " + i + " GRADE: ");
            int grade = scan.nextInt();
            scan.nextLine(); // Consume the newline character
            Student student = new Student(name, id, grade);
            students.add(student);
        }
        System.out.println("ENTER THE NUMBER OF TEACHERS");
        int numTeachers = scan.nextInt();
        scan.nextLine(); // Consume the newline character
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (int i = 1; i <= numTeachers; i++) {
            System.out.print("ENTER TEACHER " + i + " NAME: ");
            String name = scan.nextLine();
            System.out.print("ENTER TEACHER " + i + " SUBJECT: ");
            String subject = scan.nextLine();
            Teacher teacher = new Teacher(name, subject);
            teachers.add(teacher);
        }
        College college = new College(collegeName, students, teachers);
        // Display college information
        System.out.println("College Name: " + college.getName());
        System.out.println("Students:");
        for (Student student : college.getStudents()) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Grade: " + student.getGrade());
            System.out.println();
        }
        System.out.println("Teachers:");
        for (Teacher teacher : college.getTeachers()) {
            System.out.println("Name: " + teacher.getName());
            System.out.println("Subject: " + teacher.getSubject());
            System.out.println();
        }
        scan.close();
    }
}