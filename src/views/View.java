package views;

import java.util.Scanner;
import models.Person;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println();
        System.out.println("==== MENÚ ====");
        System.out.println("1. Ingresar personas");
        System.out.println("2. Ordenar personas");
        System.out.println("3. Buscar persona");
        System.out.println("4. Mostrar personas");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // limpiar el salto de línea pendiente
        return option;
    }

    public Person inputPerson() {
        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Edad: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // limpiar el salto de línea pendiente

        return new Person(name, age);
    }

    public int selectSortingMethod() {
        System.out.println();
        System.out.println("Seleccione método de ordenamiento:");
        System.out.println("1. Burbuja por nombre (asc)");
        System.out.println("2. Selección por nombre (desc)");
        System.out.println("3. Inserción por edad (asc)");
        System.out.println("4. Inserción por nombre (asc)");
        System.out.print("Opción: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // limpiar el salto de línea pendiente
        return option;
    }


    public int selectSearchCriterion() {
        System.out.println();
        System.out.println("Seleccione criterio de búsqueda:");
        System.out.println("1. Por edad");
        System.out.println("2. Por nombre");
        System.out.print("Opción: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // limpiar el salto de línea pendiente
        return option;
    }

    public void displayPersons(Person[] people) {
        if (people.length == 0) {
            System.out.println("No hay personas para mostrar.");
            return;
        }
        System.out.println();
        System.out.println("==== LISTA DE PERSONAS ====");
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("===========================\n");
    }

    public void displaySearchResult(Person person) {
        if (person == null) {
            System.out.println("Persona no encontrada.");
        } else {
            System.out.println("Persona encontrada: " + person);
        }
    }

    public int inputAge() {
        System.out.print("Ingrese edad a buscar: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // limpiar el salto de línea pendiente
        return age;
    }

    public String inputName() {
        System.out.print("Ingrese nombre a buscar: ");
        return scanner.nextLine();
    }
}
