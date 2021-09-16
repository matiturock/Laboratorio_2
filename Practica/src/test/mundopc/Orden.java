package test.mundopc;

import java.util.Arrays;

public class Orden {
  private final int ID_ORDEN;
  private Computadora[] arrayComputadoras;
  private int indexArrayComputadoras; // sigue la carga del array
  private static int contadorOrden;
  private final static int MAX_CANTIDAD_COMPUTADORAS = 10;

  public Orden() {
    this.ID_ORDEN = ++Orden.contadorOrden;
    this.arrayComputadoras = new Computadora[Orden.MAX_CANTIDAD_COMPUTADORAS];
  }

  public void agergarComputadora(Computadora computadora) {
    if (this.indexArrayComputadoras < Orden.MAX_CANTIDAD_COMPUTADORAS) {
      this.arrayComputadoras[this.indexArrayComputadoras] = computadora;
      this.indexArrayComputadoras++;
    } else
      System.out.println(
          "No se pueden agregar más computadoras a la orden. Se llegó al límite de " + Orden.MAX_CANTIDAD_COMPUTADORAS);
  }

  @Override
  public String toString() {
    return "Orden [ID_ORDEN=" + ID_ORDEN + ", listaComputadoras=" + Arrays.toString(arrayComputadoras) + "]";
  }

  public void mostrarOrden() {
    System.out.println("\nOrden ID: " + this.ID_ORDEN);
    System.out.println("\nComputadoras de la orden:");
    for (int i = 0; i < this.indexArrayComputadoras; i++) {
      System.out.println(arrayComputadoras[i]);
    }
  }

}
