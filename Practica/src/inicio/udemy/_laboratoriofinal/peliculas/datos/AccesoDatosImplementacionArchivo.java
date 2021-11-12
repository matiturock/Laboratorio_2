package inicio.udemy._laboratoriofinal.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import inicio.udemy._laboratoriofinal.peliculas.domain.Pelicula;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.AccesoDatosExcepciones;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.EscrituraDatosExcepciones;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.LecturaDatosExcepciones;

public class AccesoDatosImplementacionArchivo implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosExcepciones {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosExcepciones {
        File archivo = new File(nombreRecurso);
        List<Pelicula> listaPeliculas = new ArrayList<>();

        // lesctura del archivo para obtener los nombres de las pliculas y volcarlos a
        // la lista
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();

            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                listaPeliculas.add(pelicula);
                linea = entrada.readLine();
            }

            entrada.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // en este punto no sólo vamos a capturar la excepción, sino que también vamos a
            // propagarla
            throw new LecturaDatosExcepciones("Excepción al listar películas: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosExcepciones("Excepción al listar películas: " + e.getMessage());
        }

        return listaPeliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, Boolean anexar) throws EscrituraDatosExcepciones {
        var archivo = new File(nombreRecurso);
        try {
            var escritura = new PrintWriter(new FileWriter(archivo, anexar));
            escritura.println(pelicula.toString());
            escritura.close();
            System.out.println("Se ha escrito información al archivo: " + pelicula);
        } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraDatosExcepciones("Excepción al escribir películas: " + e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosExcepciones {
        var archivo = new File(nombreRecurso);
        String resultado = null;

        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String salida = null;
            salida = entrada.readLine();
            int indice = 1;

            while (salida != null) {
                if (buscar != null && buscar.equalsIgnoreCase(salida)) {
                    resultado = String.format("Pelicula '%s' encontrada en el índice %d", salida, indice);
                }
                salida = entrada.readLine();
                indice++;
            }

            entrada.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosExcepciones("Excepción al buscar pelicula: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosExcepciones("Excepción al buscar pelicula: " + e.getMessage());
        }

        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosExcepciones {
        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new AccesoDatosExcepciones("Excepción al crear archivo: " + e.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosExcepciones {
        var archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Se ha borrado el archivo");
        }
        System.out.println("El archivo no existe");
        // más allá que no lance ninguna excepción, se puede mantener o borrar la
        // excepción, más no afecta que esté en la firma del método en la interfaz
    }

}
