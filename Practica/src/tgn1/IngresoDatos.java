package tgn1;

import java.util.Scanner;

public class IngresoDatos {

  // TODO validación de datos y manejo de excepciones

  static String ingresarNombre() {
    Scanner s = new Scanner(System.in);

    System.out.println("Ingrese nombre:");
    String nombre = s.nextLine();

    s.close();
    return nombre;
  }

  public static Integer ingresarEdad() {
    Scanner s = new Scanner(System.in);

    try {
      System.out.println("Ingrese edad:");
      Integer edad = s.nextInt();
      s.close();
      return edad;
    } catch (Exception e) {
      System.out.println("Error en el ingreso de datos");
      return null;
    }

  }

  public static String ingresarFila() {
    Scanner s = new Scanner(System.in);

    System.out.println("Ingrese letra de la Fila:");
    String letraFila = String.valueOf(s.nextLine().charAt(0));

    s.close();
    return letraFila;
  }

  public static Integer IngresarButaca() {
    Scanner s = new Scanner(System.in);

    try {
      System.out.println("Ingrese edad:");
      Integer edad = s.nextInt();
      s.close();
      return edad;
    } catch (Exception e) {
      System.out.println("Error en el ingreso de datos");
      return null;
    }

  }

}
