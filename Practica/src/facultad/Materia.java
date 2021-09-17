package facultad;

import java.util.ArrayList;

public class Materia implements Informacion {
  private String nombre;
  private Profesor profesor;
  ArrayList<Estudiante> colEstudiantes;

  public Materia(String nombre, Profesor profesor, ArrayList<Estudiante> colEstudiantes) {
    this.nombre = nombre;
    this.profesor = profesor;
    this.colEstudiantes = new ArrayList<>();
    this.colEstudiantes = colEstudiantes;
  }

  @Override
  public int verCantidad() {
    return this.colEstudiantes.size();
  }

  @Override
  public String listarContenidos() {
    String str = "Listado de Estudiantes en la materia " + this.nombre + "\n";
    for (Estudiante est : this.colEstudiantes) {
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
    return colEstudiantes;
  }

  public void setColEstudiantes(ArrayList<Estudiante> colEstudiantes) {
    this.colEstudiantes = colEstudiantes;
  }

  public void agregarEstudiante(Estudiante estudiante) {
    this.colEstudiantes.add(estudiante);
  }

  public void removerEstudiante(String nombreEstudiante) {
    boolean contiene = false;
    for (Estudiante o : this.colEstudiantes) {
      if (o.getNombre() == nombreEstudiante) {
        this.colEstudiantes.remove(o);
        contiene = true;
      }
    }
    if (contiene)
      System.out.println("Estudiante removido");
    else
      System.out.println("El estudiante no se encuentra en la lista");
  }

  @Override
  public String toString() {
    String str = String.format("Materia %s\n" + "%s\n" + "%s\n", this.nombre.toUpperCase(), this.profesor,
        this.colEstudiantes);
    return str;
  }

}
