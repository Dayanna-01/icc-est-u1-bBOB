# Informe de Práctica: Búsqueda y Ordenamiento en Java

---

## 📌 Información General

* **Título:** Práctica de Búsqueda y Ordenamiento de Objetos
* **Asignatura:** Estructura de Datos
* **Carrera:** Computación
* **Estudiante:** Janelly Dayanna Chacha Vélez
* **Fecha:** 20/11/2025
* **Profesor:** Ing. Pablo Torres
* **Objetivo Principal:** Implementar y reforzar los algoritmos de búsqueda y ordenamiento con objetos en Java, utilizando el patrón **MVC**.

---

## II. Estructura de la Aplicación (Patrón MVC)

El proyecto está organizado en **tres componentes clave** para asegurar la separación de responsabilidades:

1.  **Modelo (`models.Person`):** Clase que define la estructura de datos (`name`, `age`).
2.  **Vista (`views.View`):** Maneja toda la interacción con el usuario (mostrar menú, recibir entradas y desplegar resultados).
3.  **Controladores (`controllers.*`):** Contiene la lógica central.
    * `Controller`: Coordina el flujo de la aplicación.
    * `SortingMethods`: Implementa los algoritmos de ordenamiento.
    * `SearchMethods`: Implementa los métodos de búsqueda binaria y verificación.

---

## III. Algoritmos Implementados

| Tipo de Operación | Criterio | Algoritmos Utilizados |
| :--- | :--- | :--- |
| **Ordenamiento** | Por Nombre | Burbuja, Selección Descendente, Inserción |
| **Ordenamiento** | Por Edad | Inserción |
| **Búsqueda** | Por Nombre/Edad | **Búsqueda Binaria** |

#### Verificación de Pre-requisito de Búsqueda
La aplicación garantiza que la **Búsqueda Binaria** solo se ejecute sobre una lista ordenada. Si el arreglo no cumple con el orden requerido (por nombre o edad), el sistema lo **ordena automáticamente** antes de proceder con la búsqueda.

---

## IV. Requisitos Técnicos

* **Lenguaje:** JAVA
* **Diseño:** Patrón Modelo-Vista-Controlador (MVC)

---

## V. Conclusiones

* **Aplicación del Patrón MVC:** La implementación del patrón MVC fue crucial para la **modularidad del código**, logrando aislar la lógica de negocio (algoritmos) de la presentación (interfaz de usuario), lo que facilita el mantenimiento.
* **Eficiencia y Validación:** Se confirmó que la **Búsqueda Binaria** es altamente eficiente, pero su corrección depende del pre-requisito de un arreglo ordenado. La función de **auto-ordenamiento** implementada antes de la búsqueda es vital para garantizar la exactitud y eficiencia del algoritmo.
