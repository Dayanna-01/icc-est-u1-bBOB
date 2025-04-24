package views;

import models.Person;
import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    // Muestra el menú principal y retorna la opción seleccionada
    public int showMenu() {
        System.out.println("=== Menú Principal ===");
        System.out.println("1. Agregar persona");
        System.out.println("2. Mostrar personas");
        System.out.println("3. Ordenar personas");
        System.out.println("4. Buscar persona");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    // Solicita nombre y edad, y retorna un nuevo objeto Person
    public Person inputPerson() {
        scanner.nextLine(); // limpiar buffer
        System.out.print("Ingrese el nombre: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int age = scanner.nextInt();
        return new Person(name, age);
    }

    // Permite seleccionar el método de ordenamiento
    public int selectSortingMethod() {
        System.out.println("=== Métodos de Ordenamiento ===");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.println("6. Shell Sort");
        System.out.print("Seleccione un método: ");
        return scanner.nextInt();
    }

    // Permite seleccionar el criterio de búsqueda
    public int selectSearchCriterion() {
        System.out.println("=== Criterio de Búsqueda ===");
        System.out.println("1. Buscar por nombre");
        System.out.println("2. Buscar por edad");
        System.out.print("Seleccione un criterio: ");
        return scanner.nextInt();
    }

    // Muestra un arreglo de personas
    public void displayPersons(Person[] people) {
        System.out.println("=== Lista de Personas ===");
        System.out.println();
        for (Person person : people) {
            System.out.println(person);
        }
    }

    // Muestra el resultado de la búsqueda
    public void displaySearchResult(Person person) {
        if (person != null) {
            System.out.println("Persona encontrada: " + person);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    // Solicita una edad
    public int inputAge() {
        System.out.print("Ingrese la edad: ");
        return scanner.nextInt();
    }

    // Solicita un nombre
    public String inputName() {
        scanner.nextLine(); // limpiar buffer
        System.out.print("Ingrese el nombre: ");
        return scanner.nextLine();
    }
}
