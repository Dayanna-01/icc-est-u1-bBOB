import controllers.Controller;
import models.Person;
import views.View;

public class App {

    public static void main(String[] args) {
        // Crear algunas personas para el arreglo
        Person[] people = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("David", 20)
        };

        // Crear la vista y el controlador
        View view = new View();
        Controller controller = new Controller(people, view);

        // Mostrar las personas antes de ordenar
        System.out.println("Before sorting:");
        controller.displayPeople();

        // Ordenar las personas utilizando el algoritmo de ordenamiento
        controller.sortPeople();

        // Mostrar las personas después de ordenar
        System.out.println("\nAfter sorting:");
        controller.displayPeople();
    }
}
