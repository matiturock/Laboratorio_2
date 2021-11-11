package inicio.udemy._laboratoriofinal.peliculas.datos;

import java.util.ArrayList;
import java.util.List;

import inicio.udemy._laboratoriofinal.peliculas.domain.Pelicula;

/**
 * Contiene las operaciones a ejecutar en archivo.txt
 */
public interface AccesoDatos {
  public static boolean existe(String nombrePelicula) {
    return false;
  }

  public static List<Pelicula> listar(String nombre) {
    List<Pelicula> listaPeliculas = new ArrayList<>();
    return listaPeliculas;
  }

  public static void escribir(Pelicula pelicula, String nombreArchivo, Boolean anexar) {

  }

  public static String buscar(String nombreArchivo, String buscar) {
    return null;
  }

  public static void crear(String nombreArchivo) {

  }

  public static void borrar(String nombreArchivo) {

  }
}
