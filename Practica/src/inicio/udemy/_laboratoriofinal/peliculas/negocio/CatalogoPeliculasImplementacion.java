package inicio.udemy._laboratoriofinal.peliculas.negocio;

import inicio.udemy._laboratoriofinal.peliculas.datos.AccesoDatosImplementacionArchivo;
import inicio.udemy._laboratoriofinal.peliculas.datos.IAccesoDatos;
import inicio.udemy._laboratoriofinal.peliculas.domain.Pelicula;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.AccesoDatosExcepciones;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.LecturaDatosExcepciones;

/**
 * Contiene la implementación de las operaciones necesarias de la aplicación
 * Catálogo Películas
 */
public class CatalogoPeliculasImplementacion implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImplementacion() {
        // acá es donde unsamos la clase que implementa la interface
        this.datos = new AccesoDatosImplementacionArchivo();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        var pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = this.datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosExcepciones e) {
            // ya depende del programador seguir propagando el error por las demás clases
            // que implementen este método, o cortar con un print de consola
            System.out.println("Excepción de acceso a datos");
            e.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var listadoPeliculas = this.datos.listar(NOMBRE_RECURSO);

            for (Pelicula pelicula : listadoPeliculas) {
                System.out.println(pelicula);
            }

        } catch (AccesoDatosExcepciones e) {
            System.out.println("Excpción al listar peliculas");
            e.printStackTrace();
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
            if (resultado != null)
                System.out.println("Pelicula encontrada: " + resultado);
            else
                System.out.println("Pelicula no encontrada");

        } catch (LecturaDatosExcepciones e) {
            System.out.println("Excepción al buscar en el archivo: ");
            e.printStackTrace();
        }
    }

    @Override
    public void iniciarArchivo() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosExcepciones e) {
            System.out.println("Excepción al iniciar el archivo");
            e.printStackTrace();
        }
    }

}
