package model;

public class Student {
    private static int counter = 1;
    private final int id;
    private final String name;

    public Student(String name) {
        this.id = counter++;
        this.name = name;
    }

    public int getId() { return id; }

    public String getName() { return name; }
}
