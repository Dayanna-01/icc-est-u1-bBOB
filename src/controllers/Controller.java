package controllers;

import models.Person;
import views.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;
    private List<Person> persons;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        this.persons = new ArrayList<>();
    }

    public void start() {
        int option;
        do {
            option = view.showMenu();
            switch (option) {
                case 1 -> addPersons();
                case 2 -> view.displayPersons(persons.toArray(new Person[0]));
                case 3 -> sortPersons();
                case 4 -> searchPerson();
                case 0 -> System.out.println("Adioooooooooooooooos");
                default -> System.out.println("Opción no válida.");
            }
        } while (option != 0);
    }

    public void inputPersons() {
        int count;
        System.out.print("¿Cuántas personas desea ingresar? ");
        count = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i < count; i++) {
            persons.add(view.inputPerson());
        }
    }

    public void addPersons() {
        persons.add(view.inputPerson());
    }

    public void sortPersons() {
        if (persons.isEmpty()) {
            System.out.println("No hay personas para ordenar.");
            return;
        }

        int method = view.selectSortingMethod();
        Person[] array = persons.toArray(new Person[0]);
        sortingMethods.sort(array, method);
        persons = new ArrayList<>(List.of(array));
        System.out.println("Personas ordenadas:");
        view.displayPersons(array);
    }

    public void searchPerson() {
        if (persons.isEmpty()) {
            System.out.println("No hay personas para buscar.");
            return;
        }

        int criterion = view.selectSearchCriterion();
        Person[] array = persons.toArray(new Person[0]);

        // Asegurarse que está ordenado según el criterio
        sortingMethods.sort(array, criterion == 1 ? 1 : 0); // 1: nombre, 0: edad

        Person result = null;
        if (criterion == 1) {
            String name = view.inputName();
            result = searchMethods.binarySearchByName(array, name);
        } else {
            int age = view.inputAge();
            result = searchMethods.binarySearchByAge(array, age);
        }

        view.displaySearchResult(result);
    }
}
