package controllers;

import models.Person;

public class SearchMethods {

    public static Person binarySearchByName(Person[] people, String name) {
        int left = 0, right = people.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = people[mid].getName().compareToIgnoreCase(name);
            if (cmp == 0) return people[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static Person binarySearchByAge(Person[] people, int age) {
        int left = 0, right = people.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = Integer.compare(people[mid].getAge(), age);
            if (cmp == 0) return people[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
