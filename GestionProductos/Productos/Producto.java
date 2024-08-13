package Productos;

public class Producto {
    private String nombre;
    private double precio;
    private String categoria;
    private int stock;

    // Constructor que no recibe parámetros y inicializa valores predeterminados
    public Producto() {
        this.nombre = "Producto sin nombre";
        this.precio = 0.0;
        this.categoria = "Sin categoría";
        this.stock = 0;
    }

    // Constructor que inicializa el producto con un nombre, precio y categoría
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = 0;
    }

    // Constructor que inicializa el producto con un nombre, precio, categoría y stock
    public Producto(String nombre, double precio, String categoria, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    //Método para mostrar informacion de una instancia
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Categoría: " + categoria);
        System.out.println("Stock: " + stock + " unidades");
    }
    
    // Métodos getter y setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Métodos getter y setter para la categoría
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Métodos getter y setter para el stock
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método para aplicar descuento por porcentaje
    public void aplicarDescuento(double porcentajeDescuento) {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            System.out.println("El descuento debe ser un valor entre 0 y 100.");
            return;
        }
        double descuento = (porcentajeDescuento / 100) * precio;
        precio -= descuento;
    }

    // Método para aplicar descuento directo en la moneda local
    public void aplicarDescuentoDirecto(double descuentoDirecto) {
        if (descuentoDirecto < 0) {
            System.out.println("El descuento directo no puede ser negativo.");
            return;
        }
        precio -= descuentoDirecto;
    }

    // Método para incrementar el stock en una cantidad específica
    public void incrementarStock(int cantidad) {
        if (cantidad < 0) {
            System.out.println("La cantidad a incrementar debe ser un valor positivo.");
            return;
        }
        stock += cantidad;
    }

    // Método para ajustar el stock a un valor exacto
    public void ajustarStock(int cantidad) {
        if (cantidad < 0) {
            System.out.println("El stock no puede ser negativo.");
            return;
        }
        stock = cantidad;
    }
}
