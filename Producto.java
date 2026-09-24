public class Producto {

    // Datos del producto
    int id;
    String nombre;

    // Referencias a los hijos izquierdo y derecho
    Producto izquierdo;
    Producto derecho;

    // Constructor del producto
    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;

        // Al crear el producto todavía no tiene hijos
        this.izquierdo = null;
        this.derecho = null;
    }
}