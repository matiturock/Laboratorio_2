package test.practicaclases;

public class Orden {
  private int idOrden;
  private Producto[] productos;
  private static int contadorOrdenes;
  private int cantProdcutos;
  public static final int MAX_PRODUCTOS = 10;

  Orden() {
    this.idOrden = ++Orden.contadorOrdenes;
    this.productos = new Producto[Orden.MAX_PRODUCTOS];
  }

  public void agergarProdcuto(Producto producto) {
    if (this.cantProdcutos < Orden.MAX_PRODUCTOS) {
      this.productos[this.cantProdcutos++] = producto;
    } else {
      System.err.println("Se ha superado el máximo permitido de productos: " + Orden.MAX_PRODUCTOS);
    }
  }

  public double calcularTotal() {
    double total = 0;

    for (int i = 0; i < this.cantProdcutos; i++) {
      total += this.productos[i].getPrecio();
    }
    return total;
  }

  public void mostrarOrden() {
    System.out.println("ID Orden: " + this.idOrden);
    System.out.println("Total: $" + this.calcularTotal());
    System.out.println("PRODUCTOS");
    for (int i = 0; i < this.cantProdcutos; i++) {
      System.out.println(this.productos[i]);
    }
  }
}
