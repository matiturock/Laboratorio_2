package inicio.udemy.manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManjoArchivos {

  public static void crearArchivo(String nombre) {
    File archivo = new File(nombre);
    try {
      PrintWriter salida = new PrintWriter(archivo);
      salida.close();
      System.out.println("Se ha creado el archivo: " + nombre);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void escribirArchivo(String nombreArchivo, String contenido) {
    File archivo = new File(nombreArchivo);
    try {
      PrintWriter salida = new PrintWriter(archivo);
      salida.println(contenido);
      salida.close();
      System.out.println("Se ha escrito al archivo");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void anexarArchivo(String nombreArchivo, String contenido) {
    File archivo = new File(nombreArchivo);
    try {
      PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
      salida.println(contenido);
      salida.close();
      System.out.println("Se ha anexado info al archivo");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void leerArchivo(String nombreArhivo) {
    File archivo = new File(nombreArhivo);
    try {
      BufferedReader entrada = new BufferedReader(new FileReader(archivo));
      String lectura = entrada.readLine();

      while (lectura != null) {
        System.out.println(lectura);
        lectura = entrada.readLine();
      }

      entrada.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
