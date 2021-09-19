package facultad;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionDatos {

  public static String ingresarSoloLetras(Scanner s) {
    Pattern patronLetras = Pattern.compile("[A-Za-z]");
    String nombre;
    Matcher m;

    while (true) {
      nombre = s.nextLine();
      m = patronLetras.matcher(nombre);

      if (m.find())
        break;
      else
        System.out.println("Ingresa un solo letras o espacios correcto");
    }

    return nombre;
  }

  public static int ingresarLegajo(Scanner s) {
    Pattern patronNros = Pattern.compile("[0-9]");
    String legajo;
    Matcher m;

    while (true) {
      legajo = s.nextLine();
      // se evalua legajo, bajos las reglas que el matcher toma del pattern
      m = patronNros.matcher(legajo);

      if (m.find())
        break;
      else
        System.out.println("Ingresa un nro. de legajo correcto");
    }

    return Integer.parseInt(legajo);
  }

}
