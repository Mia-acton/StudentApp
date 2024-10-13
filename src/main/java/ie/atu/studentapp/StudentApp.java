package ie.atu.studentapp;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Student 1
        System.out.print("Enter student 1 name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter student 1 email: ");
        String email1 = scanner.nextLine();
        System.out.print("Enter student 1 course: ");
        String course1 = scanner.nextLine();

        Student student1 = new Student();
        student1.setName(name1);
        student1.setEmail(email1);
        student1.setCourse(course1);

        // Input for Student 2
        System.out.print("Enter student 2 name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter student 2 email: ");
        String email2 = scanner.nextLine();
        System.out.print("Enter student 2 course: ");
        String course2 = scanner.nextLine();

        Student student2 = new Student(name2);
        student2.setEmail(email2);
        student2.setCourse(course2);

        // Input for Student 3
        System.out.print("Enter student 3 name: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter student 3 email: ");
        String email3 = scanner.nextLine();
        System.out.print("Enter student 3 course: ");
        String course3 = scanner.nextLine();

        Student student3 = new Student(name3, email3, course3);

        // Display Student Information
        System.out.println("Student 1: Name: " + student1.getName() +
                ", Email: " + student1.getEmail() +
                ", Course: " + student1.getCourse());

        System.out.println("Student 2: Name: " + student2.getName() +
                ", Email: " + student2.getEmail() +
                ", Course: " + student2.getCourse());

        System.out.println("Student 3: Name: " + student3.getName() +
                ", Email: " + student3.getEmail() +
                ", Course: " + student3.getCourse());
    }
}
