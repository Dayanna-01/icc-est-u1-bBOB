package controllers;

import models.Person;

public class SearchMethods {

    // Búsqueda binaria por edad (requiere arreglo ordenado por edad ascendente)
    public Person binarySearchByAge(Person[] people, int age) {
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (people[mid].getAge() == age) {
                return people[mid];
            } else if (people[mid].getAge() < age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Búsqueda binaria por nombre (requiere arreglo ordenado por nombre ascendente)
    public Person binarySearchByName(Person[] people, String name) {
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = people[mid].getName().compareToIgnoreCase(name);
            if (cmp == 0) {
                return people[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Verifica si el arreglo está ordenado por edad ascendente
    public boolean isSortedByAge(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            if (people[i].getAge() > people[i + 1].getAge()) {
                return false;
            }
        }
        return true;
    }

    // Verifica si el arreglo está ordenado por nombre ascendente
    public boolean isSortedByName(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            if (people[i].getName().compareToIgnoreCase(people[i + 1].getName()) > 0) {
                return false;
            }
        }
        return true;
    }
}
