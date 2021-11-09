package inicio.udemy.manejoarchivos.test;

import static inicio.udemy.manejoarchivos.ManjoArchivos.*;

public class TestManejoArchivos {
  public static void main(String[] args) {
    String nombre = "prueba.txt";
    // crearArchivo(nombre);

    String contenido = "Hola desde Java";
    escribirArchivo(nombre, contenido);
    anexarArchivo(nombre, "Esta es la segunda linea");
    anexarArchivo(nombre, "Esta es la tercer linea");

    leerArchivo(nombre);
  }
}
