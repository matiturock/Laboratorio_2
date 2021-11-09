package udemy.instance.test;

import udemy.instance.*;

public class TestInstance {
  public static void main(String[] args) {
    Empleado emp1 = new Empleado("Marcos", 123);
    emp1 = new Gerente("Claudio", 456, "Sistemas");

    determinarTipo(emp1);

    System.out.println(((Gerente) emp1).getDepartamento()); // casteo de tipos para acceder a metodos de la clase hija
    // tambien se puede hacer la conversión en dos líneas

  }

  public static void determinarTipo(Empleado empleado) {
    if (empleado instanceof Gerente)
      System.out.println("Es instancia de Gerente");
    else if (empleado instanceof Empleado)
      System.out.println("Es instancia de Empleado");
    else if (empleado instanceof Object)
      System.out.println("Es instancia de Objeto");
  }
}
