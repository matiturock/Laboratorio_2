package inicio.udemy._laboratoriofinal.peliculas.datos;

import java.util.List;

import inicio.udemy._laboratoriofinal.peliculas.domain.Pelicula;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.AccesoDatosExcepciones;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.EscrituraDatosExcepciones;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.LecturaDatosExcepciones;

/**
 * Contiene las operaciones a ejecutar en archivo.txt
 */
public interface IAccesoDatos {
    boolean existe(String nombreRecurso) throws AccesoDatosExcepciones;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosExcepciones;

    void escribir(Pelicula pelicula, String nombreRecurso, Boolean anexar) throws EscrituraDatosExcepciones;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosExcepciones;

    void crear(String nombreRecurso) throws AccesoDatosExcepciones;

    void borrar(String nombreRecurso) throws AccesoDatosExcepciones;
}
