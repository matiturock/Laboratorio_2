package inicio.udemy._laboratoriofinal.peliculas.datos;

import java.util.List;

import inicio.udemy._laboratoriofinal.peliculas.domain.Pelicula;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.AccesoDatosExcepciones;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.EscrituraDatosExcepciones;
import inicio.udemy._laboratoriofinal.peliculas.excepciones.LecturaDatosExcepciones;

public class AccesoDatosImplementacion implements AccesoDatos {

  @Override
  public boolean existe(String nombreRecurso) throws AccesoDatosExcepciones {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosExcepciones {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void escribir(Pelicula pelicula, String nombreRecurso, Boolean anexar) throws EscrituraDatosExcepciones {
    // TODO Auto-generated method stub

  }

  @Override
  public String buscar(String nombreRecurso, String buscar) throws LecturaDatosExcepciones {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void crear(String nombreRecurso) throws AccesoDatosExcepciones {
    // TODO Auto-generated method stub

  }

  @Override
  public void borrar(String nombreRecurso) throws AccesoDatosExcepciones {
    // TODO Auto-generated method stub

  }

}
