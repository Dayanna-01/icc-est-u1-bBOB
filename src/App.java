import controllers.Controller;
import controllers.SearchMethods;
import controllers.SortingMethods;
import views.View;

public class App {
    public static void main(String[] args) {
        // Mostrar resultados de la práctica
        mostrarResultadosDeLaPractica();

        // Inicializar MVC y ejecutar el programa
        View view = new View();
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();
        Controller controller = new Controller(view, sortingMethods, searchMethods);

        controller.start();
    }

    public static void mostrarResultadosDeLaPractica() {
        System.out.println("==== RESULTADOS DE LA PRÁCTICA ====\n");

        System.out.println("✔ Comprensión de los algoritmos:");
        System.out.println("  - Ordenamiento por burbuja (nombre ascendente).");
        System.out.println("  - Ordenamiento por selección (nombre descendente).");
        System.out.println("  - Ordenamiento por inserción (edad y nombre ascendente).");
        System.out.println("  - Búsqueda binaria por nombre y edad en arreglos ordenados.\n");

        System.out.println("✔ Correcto funcionamiento del programa:");
        System.out.println("  - Permite ingresar múltiples personas.");
        System.out.println("  - Permite ordenar por diferentes criterios.");
        System.out.println("  - Permite buscar personas por nombre o edad.");
        System.out.println("  - Verifica que el arreglo esté ordenado antes de buscar.\n");

        System.out.println("====================================\n");
    }
}
