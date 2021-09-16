package test.ventas;

public class Ventas {
  public static void main(String[] args) {
    Orden or1 = new Orden();

    Producto prod1 = new Producto("iPhone 13", 13_000);
    Producto prod2 = new Producto("iMac", 18_500);
    Producto prod3 = new Producto("Smart Watch", 5_000);

    or1.agregarProducto(prod1);
    or1.agregarProducto(prod2);
    or1.agregarProducto(prod3);

    or1.mostrarOrden();

    Orden or2 = new Orden();

    Producto prod4 = new Producto("Remera", 200);
    Producto prod5 = new Producto("Pantalón", 500);
    Producto prod6 = new Producto("Zapatillas", 250);

    or2.agregarProducto(prod4);
    or2.agregarProducto(prod5);
    or2.agregarProducto(prod6);
    or2.agregarProducto(prod1);

    or2.mostrarOrden();
  }
}
