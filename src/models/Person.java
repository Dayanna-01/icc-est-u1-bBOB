package models;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter para name
    public String getName() {
        return name;
    }

    // Setter para name
    public void setName(String name) {
        this.name = name;
    }

    // Getter para age
    public int getAge() {
        return age;
    }

    // Setter para age
    public void setAge(int age) {
        this.age = age;
    }

    // Método para mostrar información de la persona
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
