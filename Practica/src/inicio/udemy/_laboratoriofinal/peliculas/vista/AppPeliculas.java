package inicio.udemy._laboratoriofinal.peliculas.vista;

import java.util.Scanner;

import inicio.udemy._laboratoriofinal.peliculas.negocio.CatalogoPeliculasImplementacion;
import inicio.udemy._laboratoriofinal.peliculas.negocio.ICatalogoPeliculas;

/**
 * Contiene el menu que permite al usuario seleccionar la acción a ejecutar
 * sobre el catálogo de películase
 * 
 * NOTAS: La aplicación se estructura en distintas capas, cada una con su
 * propiea responsabilidad. La intención es generar:
 * 
 * BAJO ACOPLAMIENTO: reducir al mínimo la relación entre las clases
 * 
 * ALTA COHESIÓN: que cada clase se limita a hacer su tarea y nada más. Por ello
 * la separación en capas.
 * 
 * CAPA DATOS -> se encarga de la interacción con la base de datos o archivo
 * para realizar las operacionse
 * 
 * CRUD CAPA NEGOCIOS -> se encarga de la lógica de negocios, se relaciona con
 * la capa de datos
 * 
 * CAPA VISTAS -> se encarga de mostrar una interfaz al usuario final, se
 * relaciona con la capa de negocios, más no a bajo nivel con la capa de datos
 */
public class AppPeliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        String nombreArchivo = "C:\\catalogo_peliculas\\peliculas.txt";
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImplementacion();

        while (opcion != 0) {

        }
    }
}
