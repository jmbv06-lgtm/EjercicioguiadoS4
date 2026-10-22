public class MainProducto {
    public static void main(String[] args) {
        // Consultar el contador antes de crear objetos (Debe ser 0)
        System.out.println("Total antes de crear objetos: " + Producto.getTotalCreados());

        // Crear el primer objeto usando el constructor
        Producto producto1 = new Producto("Mouse", 20, "Tecnología");
        System.out.println("Después de crear uno - Total: " + Producto.getTotalCreados());

        // Crear los otros dos objetos requeridos
        Producto producto2 = new Producto("Teclado Mecánico", 45.50, "Tecnología");
        Producto producto3 = new Producto("Agenda Ejecutiva", 12.00, "Papelería");

        // Consultar el contador final (Debe ser 3)
        System.out.println("Después de crear tres - Total: " + Producto.getTotalCreados());

        // Verificar que cada objeto conserva sus propios datos de manera independiente
        System.out.println("\n--- Detalle del Primer Producto ---");
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: $" + producto1.getPrecio());
        System.out.println("Categoría: " + producto1.getCategoria());
    }
}
