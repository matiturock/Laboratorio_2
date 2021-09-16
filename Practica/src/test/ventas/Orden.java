package test.ventas;

public class Orden {
  private int idOrden;
  private Producto[] productos;
  private int nroProductos;
  private static int contOrdenes;
  public final static int MAX_CANTIDAD_PRODUCTOS = 10;

  public Orden() {
    this.idOrden = ++Orden.contOrdenes;
    this.productos = new Producto[Orden.MAX_CANTIDAD_PRODUCTOS];
  }

  public void agregarProducto(Producto producto) {
    this.productos[this.nroProductos] = producto;
    this.nroProductos++;
  }

  public double calcularTotal() {
    double total = 0;

    for (int i = 0; i < this.nroProductos; i++) {
      total += this.productos[i].getPrecio();
    }

    return total;
  }

  public void mostrarOrden() {
    System.out.println("\nCOMERCIO CHAMIGO!");
    System.out.println("Orden ID: " + this.idOrden);
    System.out.println("---------\n");
    System.out.println("PODCUCTOS");
    for (int i = 0; i < this.nroProductos; i++) {
      System.out.println("-> " + productos[i]);
    }
    System.out.println("Total: $" + calcularTotal());
  }
}
