package facultad;

import java.util.ArrayList;

public class Materia implements Informacion {
  private String nombre;
  private Profesor profesor;
  ArrayList<Estudiante> coleccionEstudiantes;

  public Materia(String nombre, Profesor profesor, ArrayList<Estudiante> coleccionEstudiantes) {
    this.nombre = nombre;
    this.profesor = profesor;
    this.coleccionEstudiantes = new ArrayList<>();
    this.coleccionEstudiantes = coleccionEstudiantes;
  }

  @Override
  public int verCantidad() {
    return this.coleccionEstudiantes.size();
  }

  @Override
  public String listarContenidos() {
    String str = "Listado de Estudiantes en la materia " + this.nombre + "\n";
    for (Estudiante est : this.coleccionEstudiantes) {
      str += est.getApellido().toUpperCase();
      str += " " + est.getNombre() + " \n";
    }
    return str;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Profesor getProfesor() {
    return profesor;
  }

  public void setProfesor(Profesor profesor) {
    this.profesor = profesor;
  }

  public ArrayList<Estudiante> getColEstudiantes() {
    return coleccionEstudiantes;
  }

  public void setColEstudiantes(ArrayList<Estudiante> coleccionEstudiantes) {
    this.coleccionEstudiantes = coleccionEstudiantes;
  }

  public void agregarEstudiante(Estudiante estudiante) {
    this.coleccionEstudiantes.add(estudiante);
  }

  public void removerEstudiante(String nombreEstudiante) {

    for (Estudiante o : this.coleccionEstudiantes) {
      if (o.getNombre() == nombreEstudiante) {
        this.coleccionEstudiantes.remove(o);
        System.out.println("Estudiante removido");
        break;
      }
    }

    System.out.println("!El estudiante no se encuentra en la lista");
  }

  @Override
  public String toString() {
    String str = String.format("Materia %s\n" + "%s\n" + "%s\n", this.nombre.toUpperCase(), this.profesor,
        this.coleccionEstudiantes);
    return str;
  }

}
