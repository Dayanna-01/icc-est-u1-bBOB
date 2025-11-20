# 📚 Práctica Nro. 3: Algoritmos de Búsqueda y Ordenamiento con Objetos en Java

[cite_start]Este proyecto implementa y refuerza los conceptos de algoritmos de **búsqueda** y **ordenamiento** aplicados a una colección de objetos `Person` en Java[cite: 8]. [cite_start]La aplicación sigue el patrón de diseño **Modelo-Vista-Controlador (MVC)** para garantizar una estructura de código organizada y comprensible[cite: 9, 138].

---

## 🎯 Objetivos del Proyecto

* [cite_start]Implementar y reforzar los conceptos de algoritmos de búsqueda y ordenamiento con objetos en Java[cite: 8].
* [cite_start]Estructurar el código siguiendo el patrón MVC para una mejor organización y comprensión[cite: 9].
* [cite_start]Realizar operaciones como búsqueda binaria y ordenamiento (Burbuja, Selección, Inserción) de un conjunto de personas[cite: 10].
* [cite_start]Asegurar que la búsqueda binaria solo se ejecute si el arreglo está previamente ordenado por el criterio de búsqueda seleccionado[cite: 34, 115].

---

## 🛠️ Estructura del Proyecto (MVC)

La aplicación está dividida en tres paquetes principales (`models`, `views`, `controllers`) para separar la lógica de negocio, la interfaz de usuario y la coordinación de acciones.

### 1. Modelos (`models`)

| Clase | Descripción | Atributos |
| :--- | :--- | :--- |
| `Person` | [cite_start]Representa el modelo de datos: una persona con nombre y edad[cite: 88]. | `String name`, `int age` |

### 2. Vistas (`views`)

| Clase | Descripción | Métodos Clave |
| :--- | :--- | :--- |
| `View` | [cite_start]Gestiona la interfaz y la interacción con el usuario (solicitud de entradas y visualización de salidas)[cite: 89, 100]. | `showMenu()`, `inputPerson()`, `displayPersons()`, `displaySearchResult()` |

### 3. Controladores (`controllers`)

| Clase | Descripción | Responsabilidad Principal |
| :--- | :--- | :--- |
| `Controller` | [cite_start]Actúa como intermediario, coordinando la vista y las operaciones lógicas basadas en la entrada del usuario[cite: 90, 109]. | `start()`, `inputPersons()`, `sortPersons()`, `searchPerson()` |
| `SortingMethods` | [cite_start]Contiene los algoritmos de ordenamiento aplicables a la lista de personas[cite: 92]. | [cite_start]`sortByNameWithBubble()`, `sortByAgeWithInsertion()`, etc. [cite: 118] |
| `SearchMethods` | [cite_start]Contiene los algoritmos de búsqueda binaria y los métodos de verificación de orden[cite: 93, 128]. | `binarySearchByAge()`, `binarySearchByName()`, `isSortedByAge()`, `isSortedByName()` |

---

## ⚙️ Algoritmos Implementados

### Ordenamiento

[cite_start]Se utilizan múltiples algoritmos para ordenar la colección de objetos `Person` por nombre o edad[cite: 118].

* [cite_start]**Burbuja (Bubble Sort):** Por nombre (ascendente)[cite: 122].
* [cite_start]**Selección (Selection Sort):** Por nombre (descendente)[cite: 123].
* [cite_start]**Inserción (Insertion Sort):** Por edad (ascendente) y por nombre (ascendente)[cite: 124, 126].

### Búsqueda

[cite_start]Se implementa la **Búsqueda Binaria** para encontrar un objeto `Person` por un criterio específico[cite: 131, 132].

⚠️ **Validación Importante:** Antes de ejecutar la búsqueda binaria, el programa verifica automáticamente si el arreglo está ordenado por el criterio seleccionado (nombre o edad). [cite_start]Si no lo está, procede a ordenar el arreglo primero, garantizando el correcto funcionamiento del algoritmo de búsqueda binaria[cite: 34, 115].

---

## 🚀 Cómo Ejecutar el Proyecto

### Requisitos

* **Java Development Kit (JDK):** Versión 8 o superior.

### Pasos para Compilar y Ejecutar

1.  **Clonar/Descargar el Repositorio:**
    ```bash
    git clone [ENLACE_DE_TU_REPOSITORIO]
    cd App.OrdenamientoBusqueda
    ```
2.  **Compilar (si usa terminal):**
    ```bash
    # Compilar los archivos .java
    javac -d bin src/**/*.java 
    ```
3.  **Ejecutar:**
    ```bash
    # Ejecutar la clase Main
    java -cp bin Main 
    ```

**(Alternativa IDE: Simplemente ejecuta la clase `Main.java` dentro de tu entorno de desarrollo (NetBeans, Eclipse, IntelliJ, etc.))**