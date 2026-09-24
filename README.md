# Tree-Stock

## Descripción

Tree-Stock es un sistema de inventario desarrollado en Java que utiliza un Árbol Binario de Búsqueda (BST) para registrar, organizar y buscar productos mediante su ID.

El proyecto permite aplicar los conceptos de árboles binarios, referencias entre nodos y métodos recursivos para la gestión de un inventario.

## Objetivo

Implementar un sistema de inventario utilizando un Árbol Binario de Búsqueda en Java, aplicando estructuras dinámicas, referencias entre nodos y métodos recursivos.

El sistema permite:

* Registrar productos.
* Organizar los productos según su ID.
* Mostrar el inventario ordenado por ID.
* Buscar productos mediante su ID.
* Evitar el registro de IDs repetidos.

## Estructura del proyecto

El proyecto está dividido en tres clases principales:

### Producto.java

Representa cada producto como un nodo del árbol.

Contiene:

* ID del producto.
* Nombre del producto.
* Referencia al nodo izquierdo.
* Referencia al nodo derecho.

### ArbolInventario.java

Contiene la lógica principal del Árbol Binario de Búsqueda.

Se encarga de:

* Insertar productos.
* Ubicar los productos según su ID.
* Recorrer el árbol mediante un recorrido inorden.
* Buscar productos mediante su ID.

La regla utilizada para organizar el árbol es:

* Si el ID es menor que el ID del nodo actual, el producto se ubica hacia la izquierda.
* Si el ID es mayor que el ID del nodo actual, el producto se ubica hacia la derecha.

La inserción y la búsqueda utilizan métodos recursivos para recorrer el árbol.

### Main.java

Contiene la interfaz de consola y el menú principal del sistema.

El usuario puede seleccionar:

```text
1. Registrar Producto
2. Mostrar Inventario
3. Buscar Producto
0. Salir
```

## Herramientas utilizadas

* Java
* JDK Eclipse Temurin
* Visual Studio Code
* GitHub

## Requisitos

Para ejecutar el proyecto se necesita:

* JDK de Eclipse Temurin instalado.
* Visual Studio Code o un entorno compatible con Java.

## Instrucciones de ejecución

1. Descargar o clonar el repositorio.
2. Abrir la carpeta del proyecto en Visual Studio Code.
3. Verificar que el JDK de Eclipse Temurin esté instalado y configurado.
4. Abrir el archivo `Main.java`.
5. Ejecutar el programa.
6. Utilizar el menú de Tree-Stock para registrar, mostrar y buscar productos.

## Funcionamiento

### Registrar productos

La opción **1. Registrar Producto** permite ingresar el ID y el nombre del producto.

Ejemplo:

```text
ID: 100
Nombre: Arroz

ID: 30
Nombre: Leche

ID: 80
Nombre: Atun

ID: 20
Nombre: Huevos

ID: 12
Nombre: Cafe
```

Cada producto se convierte en un nodo del Árbol Binario de Búsqueda.

El ID determina la posición del producto dentro del árbol:

* ID menor → izquierda.
* ID mayor → derecha.

### Mostrar inventario

La opción **2. Mostrar Inventario** realiza un recorrido inorden del árbol.

El recorrido sigue el orden:

```text
Izquierda → Nodo → Derecha
```

Por esta razón, los productos aparecen ordenados de menor a mayor según su ID.

Ejemplo:

```text
===== INVENTARIO =====
Productos ordenados por ID:

ID: 12 - Nombre: Cafe
ID: 20 - Nombre: Huevos
ID: 30 - Nombre: Leche
ID: 80 - Nombre: Atun
ID: 100 - Nombre: Arroz
```

### Buscar producto

La opción **3. Buscar Producto** permite buscar un producto utilizando su ID.

El sistema compara el ID buscado con el nodo actual y decide si debe continuar la búsqueda hacia la izquierda o hacia la derecha.

Ejemplo:

```text
Ingrese el ID a buscar: 12

Producto encontrado:
ID: 12
Nombre: Cafe
```

Si el ID no existe, el sistema muestra:

```text
Producto no encontrado.
```

## Evidencias de ejecución

### 1. Menú principal

![Menú principal](capturas/Menu%20principal.png)

### 2. Inserción - registro de productos

![Inserción - registro de productos](capturas/inserción%20-%20registro%20de%20productos..png)

### 3. Búsqueda de un producto existente

![Búsqueda de un producto existente](capturas/búsqueda%20de%20un%20producto%20existente..png)

## Repositorio

Repositorio público de GitHub:

https://github.com/cristianespitia/Tree-Stock.git

## Información del estudiante

**Nombre:** Cristian Alexis Espitia Anaya
**Curso:** Estructura de Datos
**Actividad:** S30 - EA3. Actividad Final - Manipulación de Árboles en Java
