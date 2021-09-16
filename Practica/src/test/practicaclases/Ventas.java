package test.practicaclases;

public class Ventas {
  public static void main(String[] args) {
    Producto p1 = new Producto("iPhone", 1_300.0);
    Producto p2 = new Producto("Laptop", 2_000.50);
    Producto p3 = new Producto("SmartWatch", 500.50);

    Orden or1 = new Orden();

    or1.mostrarOrden();

    or1.agergarProdcuto(p1);
    or1.agergarProdcuto(p2);
    or1.agergarProdcuto(p3);

    or1.mostrarOrden();
  }
}
