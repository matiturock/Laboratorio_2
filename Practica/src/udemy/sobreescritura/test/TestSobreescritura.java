package udemy.sobreescritura.test;

import udemy.sobreescritura.Empleado;
import udemy.sobreescritura.Gerente;

public class TestSobreescritura {
  public static void main(String[] args) {
    Empleado emp1 = new Empleado("Pacha", 3000);
    imprimir(emp1);

    Gerente ger1 = new Gerente("Marcos", 1200, "Sistemas");
    // System.out.println("gerente1: " + ger1.mostrarDatos());
    imprimir(ger1);
  }

  public static void imprimir(Empleado empleado) {
    System.out.println(empleado.mostrarDatos());
  }
}
