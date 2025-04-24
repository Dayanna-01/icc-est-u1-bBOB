package controllers;

import models.Person;

public class SortingMethods {

    // Método burbuja por nombre (ascendente)
    public void sortByNameWithBubble(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[j].getName().compareToIgnoreCase(people[j + 1].getName()) > 0) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    // Método selección por nombre (descendente)
    public void sortByNameWithSelectionDes(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < people.length; j++) {
                if (people[j].getName().compareToIgnoreCase(people[maxIndex].getName()) > 0) {
                    maxIndex = j;
                }
            }
            Person temp = people[i];
            people[i] = people[maxIndex];
            people[maxIndex] = temp;
        }
    }

    // Método inserción por edad (ascendente)
    public void sortByAgeWithInsertion(Person[] people) {
        for (int i = 1; i < people.length; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getAge() > key.getAge()) {
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = key;
        }
    }

    // Método inserción por nombre (ascendente)
    public void sortByNameWithInsertion(Person[] people) {
        for (int i = 1; i < people.length; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getName().compareToIgnoreCase(key.getName()) > 0) {
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = key;
        }
    }

    // Método general para el Controller (elige algoritmo según número)
    public void sort(Person[] people, int method) {
        switch (method) {
            case 1 -> sortByNameWithBubble(people);
            case 2 -> sortByNameWithSelectionDes(people);
            case 3 -> sortByAgeWithInsertion(people);
            case 4 -> sortByNameWithInsertion(people);
            default -> System.out.println("Método no implementado.");
        }
    }
}
