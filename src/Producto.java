public class Producto {
    // 1. Atributos privados
    private String nombre;
    private double precio;
    private String categoria;

    // 2. Atributo static compartido por toda la clase para el contador
    private static int contador = 0;

    // 3. Constructor para inicializar los datos obligatorios al nacer
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        contador++; // Incrementa automáticamente el contador cada vez que se crea un objeto
    }

    // 4. Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // 5. Método static para consultar el total de objetos creados sin necesidad de instanciarlos
    public static int getTotalCreados() {
        return contador;
    }
}
