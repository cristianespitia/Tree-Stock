import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArbolInventario arbol = new ArbolInventario();

        int opcion;

        do {

            // Menú principal del sistema
            System.out.println("\n===== TREE-STOCK =====");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                // Registrar un nuevo producto
                case 1:

                    System.out.print("Ingrese el ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();

                    // Verifica que el ID no esté registrado anteriormente
                    if (arbol.buscar(id) != null) {
                        System.out.println("El ID ya existe.");
                    } else {
                        arbol.insertar(id, nombre);
                        System.out.println("Producto registrado correctamente.");
                    }

                    break;

                // Mostrar el inventario ordenado por ID
                case 2:

                    System.out.println("\n===== INVENTARIO =====");

                    if (arbol.raiz == null) {
                        System.out.println("El inventario está vacío.");
                    } else {
                        arbol.mostrarInventario();
                    }

                    break;

                // Buscar un producto por su ID
                case 3:

                    System.out.print("Ingrese el ID a buscar: ");
                    int idBuscar = scanner.nextInt();

                    Producto producto = arbol.buscar(idBuscar);

                    if (producto != null) {
                        System.out.println("Producto encontrado:");
                        System.out.println("ID: " + producto.id);
                        System.out.println("Nombre: " + producto.nombre);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }

                    break;

                // Finalizar el programa
                case 0:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}