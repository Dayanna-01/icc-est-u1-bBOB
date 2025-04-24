package models;

public class Person {
    private String name;
    private int age;

    // Constructor de la clase Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Métodos getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Método para representar el objeto como una cadena legible
    // Este método es llamado automáticamente cuando usas System.out.println(person)
    @Override
    public String toString() {
        return "Nombre: " + name + ", Edad: " + age;
    }
}
