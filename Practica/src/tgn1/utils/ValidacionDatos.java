package tgn1.utils;

import java.util.Scanner;

import tgn1.Espectador;

public class ValidacionDatos {

  public static Espectador crearEspectador() {
    String nombre;
    Integer edad;
    String letraFila;
    Integer nroButaca;

    Scanner s = new Scanner(System.in);

    try {
      System.out.println("Ingresa el nombre:");
      nombre = s.nextLine();

      System.out.println("Ingresa la edad:");
      edad = Integer.parseInt(s.nextLine());

      System.out.println("Ingresa la letra de la fila:");
      letraFila = String.valueOf(s.nextLine().toUpperCase().charAt(0));

      System.out.println("Ingresa el número de butaca:");
      nroButaca = Integer.parseInt(s.nextLine());

    } catch (Exception e) {
      System.out.println("Error en la carga de datos.");
      s.close();
      return null;
    }

    s.close();
    return new Espectador(nombre, edad, letraFila, nroButaca);
  }

}
