package inicio.udemy._laboratoriofinal.peliculas.negocio;

/**
 * Contiene las operaciones necesarias de la aplicación Catálogo Películas
 */
public interface ICatalogoPeliculas {

    // puede ir sólo "String NOMBRE...", y como es interface, se agrega en
    // automático el "public static final"
    public static final String NOMBRE_RECURSO = "peliculas.txt";

    void agregarPelicula(String nombreRecurso);

    void listarPeliculas();

    void buscarPelicula(String buscar);

    void iniciarArchivo();
}
