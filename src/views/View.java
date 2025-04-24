package views;

import models.Person;
import java.util.Scanner;

public class View {

    // Atributo de la clase View para manejar la entrada del usuario desde la consola
    private Scanner scanner = new Scanner(System.in);

    // Método para mostrar el menú principal
    public void showMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Ingresar personas");  // Opción para ingresar personas
        System.out.println("2. Mostrar personas");  // Opción para mostrar las personas registradas
        System.out.println("3. Ordenar personas");  // Opción para ordenar las personas
        System.out.println("4. Buscar persona");  // Opción para buscar personas
        System.out.println("0. Salir");  // Opción para salir del programa
    }

    // Método para ingresar los datos de una persona (nombre y edad)
    public Person inputPerson() {
        System.out.print("Nombre: ");  // Solicita el nombre de la persona
        String name = scanner.nextLine();  // Lee el nombre ingresado por el usuario
        System.out.print("Edad: ");  // Solicita la edad de la persona
        int age = Integer.parseInt(scanner.nextLine());  // Lee la edad ingresada y la convierte a entero
        return new Person(name, age);  // Retorna un objeto Person con los datos ingresados
    }

    // Método para solicitar un valor entero al usuario
    public int inputInt(String message) {
        System.out.print(message);  // Muestra el mensaje para solicitar la entrada
        return Integer.parseInt(scanner.nextLine());  // Lee el número ingresado y lo convierte a entero
    }

    // Método para solicitar una cadena de texto al usuario
    public String inputString(String message) {
        System.out.print(message);  // Muestra el mensaje para solicitar la entrada
        return scanner.nextLine();  // Lee la cadena ingresada
    }

    // Método para mostrar todas las personas registradas
    public void displayPersons(Person[] people) {
        if (people.length == 0) {  // Si el arreglo de personas está vacío
            System.out.println("No hay personas registradas.");  // Muestra un mensaje indicando que no hay personas
            return;  // Sale del método
        }
        // Muestra cada persona en el arreglo
        for (Person p : people) {
            System.out.println(p);  // Imprime cada objeto Persona (utiliza el método toString de la clase Person)
        }
    }

    // Método para mostrar los resultados de una búsqueda de persona
    public void displaySearchResult(Person person) {
        if (person != null) {  // Si se encuentra una persona
            System.out.println("Persona encontrada: " + person);  // Muestra la persona encontrada
        } else {
            System.out.println("Persona no encontrada.");  // Si la persona no fue encontrada
        }
    }

    // Método para mostrar los métodos de ordenamiento disponibles y seleccionar uno
    public int selectSortingMethod() {
        System.out.println("\n--- Métodos de Ordenamiento ---");
        System.out.println("1. Bubble Sort");  // Opción para Bubble Sort
        System.out.println("2. Bubble Sort Mejorado");  // Opción para Bubble Sort mejorado
        System.out.println("3. Selection Sort");  // Opción para Selection Sort
        System.out.println("4. Insertion Sort");  // Opción para Insertion Sort
        System.out.println("5. Shell Sort");  // Opción para Shell Sort
        System.out.println("6. Merge Sort");  // Opción para Merge Sort
        System.out.println("7. Quick Sort");  // Opción para Quick Sort
        return inputInt("Seleccione un método (1-7): ");  // Solicita al usuario elegir un método de ordenamiento
    }

    // Método para mostrar los criterios de búsqueda disponibles y seleccionar uno
    public int selectSearchCriterion() {
        System.out.println("\n--- Criterio de Búsqueda ---");
        System.out.println("1. Buscar por nombre");  // Opción para buscar por nombre
        System.out.println("2. Buscar por edad");  // Opción para buscar por edad
        return inputInt("Seleccione una opción: ");  // Solicita al usuario elegir el criterio de búsqueda
    }
}
