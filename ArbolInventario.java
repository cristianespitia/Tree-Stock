public class ArbolInventario {

    // Nodo principal del árbol
    Producto raiz;

    public ArbolInventario() {
        raiz = null;
    }

    // Inserta un nuevo producto en el árbol
    public void insertar(int id, String nombre) {

        Producto nuevo = new Producto(id, nombre);

        // Si el árbol está vacío, el nuevo producto se convierte en la raíz
        if (raiz == null) {
            raiz = nuevo;
        } else {
            // Si ya existe una raíz, se busca dónde ubicar el nuevo producto
            insertarRecursivo(raiz, nuevo);
        }
    }

    // Método recursivo que ubica el producto según su ID
    private void insertarRecursivo(Producto actual, Producto nuevo) {

        // Si el nuevo ID es menor, debe ir hacia la izquierda
        if (nuevo.id < actual.id) {

            if (actual.izquierdo == null) {
                actual.izquierdo = nuevo;
            } else {
                // Continúa buscando la posición hacia la izquierda
                insertarRecursivo(actual.izquierdo, nuevo);
            }

        // Si el nuevo ID es mayor, debe ir hacia la derecha
        } else if (nuevo.id > actual.id) {

            if (actual.derecho == null) {
                actual.derecho = nuevo;
            } else {
                // Continúa buscando la posición hacia la derecha
                insertarRecursivo(actual.derecho, nuevo);
            }
        }
    }

    // Muestra los productos utilizando un recorrido inorden
    public void mostrarInventario() {
        recorrerInorden(raiz);
    }

    // Recorrido: izquierda, nodo actual y derecha
    // Esto permite mostrar los productos ordenados por ID
    private void recorrerInorden(Producto actual) {

        if (actual != null) {

            recorrerInorden(actual.izquierdo);

            System.out.println("ID: " + actual.id +
                               " - Nombre: " + actual.nombre);

            recorrerInorden(actual.derecho);
        }
    }

    // Busca un producto utilizando su ID
    public Producto buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    // Método recursivo para realizar la búsqueda
    private Producto buscarRecursivo(Producto actual, int id) {

        // Si llegamos a una posición vacía, el producto no existe
        if (actual == null) {
            return null;
        }

        // Si los ID coinciden, encontramos el producto
        if (id == actual.id) {
            return actual;
        }

        // Si el ID buscado es menor, buscamos hacia la izquierda
        if (id < actual.id) {
            return buscarRecursivo(actual.izquierdo, id);
        } else {
            // Si es mayor, buscamos hacia la derecha
            return buscarRecursivo(actual.derecho, id);
        }
    }
}