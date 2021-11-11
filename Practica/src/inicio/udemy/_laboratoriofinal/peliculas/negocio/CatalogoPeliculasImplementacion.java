package inicio.udemy._laboratoriofinal.peliculas.negocio;

import inicio.udemy._laboratoriofinal.peliculas.datos.AccesoDatosImplementacionArchivo;
import inicio.udemy._laboratoriofinal.peliculas.datos.IAccesoDatos;
import inicio.udemy._laboratoriofinal.peliculas.domain.Pelicula;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.AccesoDatosExcepciones;

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
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosExcepciones e) {
            // ya depende del programador seguir propagando el error por las demás clases
            // que implementen este método, o cortar con un print de consola
            System.out.println("Errorde acceso a datos");
            e.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas() {
        // TODO Auto-generated method stub

    }

    @Override
    public void buscarPelicula(String buscar) {
        // TODO Auto-generated method stub

    }

    @Override
    public void iniciarArchivo() {
        // TODO Auto-generated method stub

    }

}
