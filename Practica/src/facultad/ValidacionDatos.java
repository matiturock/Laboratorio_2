package facultad;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionDatos {

  public static String ingresarSoloLetras(Scanner s) {
    Pattern siEncuentraNros = Pattern.compile("[0-9]");
    String nombre;
    Matcher m;

    while (true) {
      nombre = s.nextLine();
      m = siEncuentraNros.matcher(nombre);

      if (!(m.find()))
        break;
      else
        System.out.println("Ingresa un solo letras o espacios correcto");
    }

    nombre.trim();
    String[] str = nombre.split("\\s+");

    for (int i = 0; i < str.length; i++) {
      str[i] = str[i].trim();

    }

    return ValidacionDatos.capitalizarPrimeraLetra(nombre);
  }

  public static int ingresarLegajo(Scanner s) {
    Pattern siEncuentraLetras = Pattern.compile("[A-Za-z\\s]");
    String legajo;
    Matcher m;

    while (true) {
      legajo = s.nextLine();
      // se evalua legajo, bajos las reglas que el matcher toma del pattern
      m = siEncuentraLetras.matcher(legajo);

      if (!(m.find()))
        break;
      else
        System.out.println("Ingresa un nro. de legajo correcto");
    }

    return Integer.parseInt(legajo);
  }

  private static String capitalizarPrimeraLetra(String str) {
    str.trim();
    String[] palabras = str.split("\\s+");
    String palabrasPimeraMayuscula = "";

    for (String palabra : palabras) {
      String primerLetra = palabra.substring(0, 1);
      String resto = palabra.substring(1);
      palabrasPimeraMayuscula += primerLetra.toUpperCase() + resto + " ";
    }

    return palabrasPimeraMayuscula.trim();
  }

}
