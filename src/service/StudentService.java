package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(String name) {
        Student student = new Student(name);
        students.add(student);
        System.out.println("Student added: " + student.getName() + " (ID: " + student.getId() + ")");
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("--- List of Students ---");
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + " | Name: " + student.getName());
        }
    }
}
