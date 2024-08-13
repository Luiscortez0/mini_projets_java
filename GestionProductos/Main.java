import Productos.Producto;

public class Main{
    public static void main(String[] args) {
        Producto cafe = new Producto("Café Premium", 120.50, "Alimento");
        System.out.println("Stock inicial de " + cafe.getNombre() + ": " + cafe.getStock() + " unidades\n");

        cafe.aplicarDescuento(10); // Aplica un descuento del 10%
        System.out.println("Precio después del descuento del 10%: $" + cafe.getPrecio() + "\n");

        cafe.aplicarDescuentoDirecto(20); // Aplica un descuento de $20
        System.out.println("Precio después del descuento directo de $20: $" + cafe.getPrecio() + "\n");

        cafe.incrementarStock(50); // Añade 50 unidades al stock
        System.out.println("Stock después de incrementar en 50 unidades: " + cafe.getStock() + " unidades\n");

        cafe.ajustarStock(100); // Establece el stock a 100 unidades
        System.out.println("Stock después de ajustar a 100 unidades: " + cafe.getStock() + " unidades\n");

        cafe.mostrarDetalles();
    }
}
