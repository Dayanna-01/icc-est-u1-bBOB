package controllers;
import models.Person;
public class SortingMethods {

    // Algoritmo de Bubble Sort (Ordenamiento por burbuja)
    // Compara pares de elementos adyacentes y los intercambia si están en el orden incorrecto
    public static void bubbleSort(Person[] people) {
        int n = people.length; // Obtiene la longitud del arreglo de personas
        // Bucle principal que recorre el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Bucle interno que compara elementos adyacentes
            for (int j = 0; j < n - 1 - i; j++) {
                // Compara los nombres de las personas
                if (people[j].getName().compareTo(people[j + 1].getName()) > 0) {
                    // Intercambia los elementos si están en el orden incorrecto
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    // Algoritmo de Bubble Sort mejorado
    // Detiene el algoritmo si no se realiza ningún intercambio, lo que optimiza el rendimiento
    public static void improvedBubbleSort(Person[] people) {
        int n = people.length; // Obtiene la longitud del arreglo
        boolean swapped; // Variable para verificar si hubo intercambios
        // Bucle principal
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Resetea la variable 'swapped' en cada iteración
            // Bucle interno
            for (int j = 0; j < n - 1 - i; j++) {
                // Compara los nombres
                if (people[j].getName().compareTo(people[j + 1].getName()) > 0) {
                    // Realiza el intercambio
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                    swapped = true; // Marca que hubo un intercambio
                }
            }
            // Si no hubo intercambio, se sale del bucle
            if (!swapped) break;
        }
    }

    // Algoritmo de Selection Sort (Ordenamiento por selección)
    // Encuentra el elemento más pequeño en el arreglo y lo coloca en su posición correcta
    public static void selectionSort(Person[] people) {
        int n = people.length; // Longitud del arreglo
        // Bucle para recorrer el arreglo
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i; // Inicializa el índice del elemento mínimo
            // Encuentra el índice del elemento más pequeño
            for (int j = i + 1; j < n; j++) {
                if (people[j].getName().compareTo(people[minIdx].getName()) < 0) {
                    minIdx = j; // Actualiza el índice del mínimo
                }
            }
            // Realiza el intercambio entre el mínimo y el elemento en la posición actual
            Person temp = people[minIdx];
            people[minIdx] = people[i];
            people[i] = temp;
        }
    }

    // Algoritmo de Insertion Sort (Ordenamiento por inserción)
    // Inserta elementos en su posición correcta dentro de la porción ordenada del arreglo
    public static void insertionSort(Person[] people) {
        // Empieza desde el segundo elemento
        for (int i = 1; i < people.length; i++) {
            Person key = people[i]; // Toma el elemento actual
            int j = i - 1; // Posiciona el índice a la izquierda
            // Mueve los elementos mayores a la derecha
            while (j >= 0 && people[j].getName().compareTo(key.getName()) > 0) {
                people[j + 1] = people[j];
                j--;
            }
            // Coloca el elemento en su posición correcta
            people[j + 1] = key;
        }
    }

    // Algoritmo de Shell Sort
    // Utiliza un 'gap' para ordenar en pasos más grandes y reduce el gap gradualmente
    public static void shellSort(Person[] people) {
        int n = people.length; // Longitud del arreglo
        // Empieza con un gap grande y lo reduce cada vez
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Bucle para recorrer el arreglo con el gap
            for (int i = gap; i < n; i++) {
                Person temp = people[i]; // Toma el elemento actual
                int j = i;
                // Mueve los elementos mayores a la derecha
                while (j >= gap && people[j - gap].getName().compareTo(temp.getName()) > 0) {
                    people[j] = people[j - gap];
                    j -= gap;
                }
                // Coloca el elemento en su lugar
                people[j] = temp;
            }
        }
    }

    // Algoritmo de Merge Sort (Ordenamiento por fusión)
    // Divide el arreglo en mitades y las fusiona ordenadas
    public static void mergeSort(Person[] people) {
        if (people.length <= 1) return; // Si el arreglo tiene un solo elemento, ya está ordenado
        int mid = people.length / 2; // Encuentra el punto medio
        Person[] left = new Person[mid]; // Crea el arreglo izquierdo
        Person[] right = new Person[people.length - mid]; // Crea el arreglo derecho
        System.arraycopy(people, 0, left, 0, mid); // Copia la primera mitad al arreglo izquierdo
        System.arraycopy(people, mid, right, 0, people.length - mid); // Copia la segunda mitad al arreglo derecho

        mergeSort(left); // Ordena recursivamente la mitad izquierda
        mergeSort(right); // Ordena recursivamente la mitad derecha
        merge(people, left, right); // Fusiona los dos arreglos ordenados
    }

    // Método auxiliar para fusionar dos arreglos ordenados
    private static void merge(Person[] people, Person[] left, Person[] right) {
        int i = 0, j = 0, k = 0;
        // Fusiona los dos arreglos
        while (i < left.length && j < right.length) {
            if (left[i].getName().compareTo(right[j].getName()) <= 0) {
                people[k++] = left[i++]; // Si el elemento de la izquierda es menor, lo agrega al arreglo resultante
            } else {
                people[k++] = right[j++]; // Si el elemento de la derecha es menor, lo agrega al arreglo resultante
            }
        }
        // Copia los elementos restantes del arreglo izquierdo
        while (i < left.length) people[k++] = left[i++];
        // Copia los elementos restantes del arreglo derecho
        while (j < right.length) people[k++] = right[j++];
    }

    // Algoritmo de Quick Sort (Ordenamiento rápido)
    // Selecciona un pivote y divide el arreglo recursivamente en dos subarreglos
    public static void quickSort(Person[] people) {
        quickSortHelper(people, 0, people.length - 1); // Llama al método recursivo para ordenar
    }

    // Método auxiliar recursivo para realizar el Quick Sort
    private static void quickSortHelper(Person[] people, int low, int high) {
        if (low < high) {
            int pi = partition(people, low, high); // Encuentra el índice del pivote
            quickSortHelper(people, low, pi - 1); // Ordena la sublista izquierda
            quickSortHelper(people, pi + 1, high); // Ordena la sublista derecha
        }
    }

    // Método auxiliar para particionar el arreglo alrededor del pivote
    private static int partition(Person[] people, int low, int high) {
        Person pivot = people[high]; // El pivote es el último elemento del arreglo
        int i = low - 1; // Índice del menor elemento
        for (int j = low; j < high; j++) {
            if (people[j].getName().compareTo(pivot.getName()) <= 0) {
                i++; // Incrementa el índice del menor elemento
                // Intercambia los elementos
                Person temp = people[i];
                people[i] = people[j];
                people[j] = temp;
            }
        }
        // Coloca el pivote en su lugar
        Person temp = people[i + 1];
        people[i + 1] = people[high];
        people[high] = temp;
        return i + 1; // Retorna el índice del pivote
    }
}
