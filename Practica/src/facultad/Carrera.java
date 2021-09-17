package facultad;

import java.util.ArrayList;

public class Carrera implements Informacion {
  private String nombre;
  private ArrayList<Materia> colMaterias;

  public Carrera(String nombre, ArrayList<Materia> colMaterias) {
    this.nombre = nombre;
    this.colMaterias = colMaterias;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ArrayList<Materia> getColMaterias() {
    return colMaterias;
  }

  public void setColMaterias(ArrayList<Materia> colMaterias) {
    this.colMaterias = colMaterias;
  }

  public void agregarMateria(Materia materia) {
    this.colMaterias.add(materia);
  }

  public void removerMateria(String nombreMateria) {
    boolean contiene = false;
    for (Materia elemento : colMaterias) {
      if (elemento.getNombre() == nombreMateria) {
        colMaterias.remove(elemento);
        contiene = true;
      }
    }
    if (contiene)
      System.out.println("Materia removida.");
    else
      System.out.println("La materia no se encuentra en la lista");
  }

  public void encontrarMateria(String nombreMateria) {
    boolean contiene = false;
    for (Materia o : colMaterias) {
      if (o.getNombre() == nombreMateria) {
        System.out.println(o.toString());
        contiene = true;
      }
    }
    if (contiene)
      System.out.println("Materia encontrada");
    else
      System.out.println("La materia no se encuentra en la lista");
  }

  @Override
  public String toString() {
    return "Carrera [colMaterias=" + colMaterias + ", nombre=" + nombre + "]\n";
  }

  @Override
  public int verCantidad() {
    return this.colMaterias.size();
  }

  @Override
  public String listarContenidos() {
    String str = "Listado de Materias en la Carrera " + this.nombre + "\n";
    for (Materia o : this.colMaterias) {
      str += o + "\n";
    }
    return str;
  }

}
