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
 * CAPA VISTAS -> se encarga de mostrar una interfaz y capturar input del
 * usuario, se relaciona con la capa de negocios, más no a bajo nivel con la
 * capa de datos
 */
public class AppPeliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer opcion = -1;
        // String nombreArchivo = "C:\\catalogo_peliculas\\peliculas.txt";
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImplementacion();

        while (opcion != 0) {
            mostrarOpciones();

            // se recomienda usar el "nextLine()" porque los otros métodos no consumen todos
            // los caracteres, como ser el saltoe de línea
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
                opcion = -1;
            }

            evaluarOpcion(opcion, catalogo, scanner);
        }

        scanner.close();
        System.out.println("Fin del programa");
    }

    private static void evaluarOpcion(int opcion, ICatalogoPeliculas catalogo, Scanner scanner) {
        switch (opcion) {
        case 1:
            System.out.println("Iniciado catalogo de películas");
            catalogo.iniciarArchivo();
            break;
        case 2:
            System.out.println("Ingresa el nombre de la pelicula:");
            String nomrePelicula = scanner.nextLine();
            catalogo.agregarPelicula(nomrePelicula);
            break;
        case 3:
            System.out.println("Listado de películas:");
            catalogo.listarPeliculas();
            break;
        case 4:
            System.out.println("Ingresa el nombre de la plícula a buscar:");
            String buscar = scanner.nextLine();
            catalogo.buscarPelicula(buscar);
            break;
        case 0:
            // Fin del programa
            break;
        default:
            System.err.println("Opción incorrecta...");
            break;
        }
    }

    private static void mostrarOpciones() {
        System.out.println("\nSISTEMA DE GESTION DE BIBLIOTECA");
        System.out.println("================================");
        System.out.println("Elige una opción:");
        System.out.println("-> 1: Iniciar catálogo de películas");
        System.out.println("-> 2: Agregar película");
        System.out.println("-> 3: Listar películas");
        System.out.println("-> 4: Buscar película");
        System.out.println("-> 0: Salir");
    }
}
