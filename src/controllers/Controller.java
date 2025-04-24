package controllers;

import models.Person;
import views.View;

public class Controller {

    private Person[] people; // Atributo para almacenar un arreglo de personas
    private View view; // Atributo para la vista

    // Constructor que inicializa las personas y la vista
    public Controller(Person[] people, View view) {
        this.people = people; // Inicializa el arreglo de personas
        this.view = view; // Inicializa la vista
    }

    // Método para mostrar las personas usando la vista
    public void displayPeople() {
        view.displayPersons(people); // Llama al método de la vista para mostrar las personas
    }

    // Método para ordenar las personas utilizando un algoritmo de ordenamiento
    public void sortPeople() {
        SortingMethods.bubbleSort(people);  // Utiliza el algoritmo de Bubble Sort para ordenar el arreglo
    }
}
