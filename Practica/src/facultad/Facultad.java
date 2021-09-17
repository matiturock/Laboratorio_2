package facultad;

import java.util.ArrayList;

public class Facultad implements Informacion {
  private String nombre;
  private ArrayList<Carrera> colCarreras;

  public Facultad(String nombre, ArrayList<Carrera> colCarreras) {
    this.nombre = nombre;
    this.colCarreras = colCarreras;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ArrayList<Carrera> getColCarreras() {
    return colCarreras;
  }

  public void setColCarreras(ArrayList<Carrera> colCarreras) {
    this.colCarreras = colCarreras;
  }

  @Override
  public int verCantidad() {
    return this.colCarreras.size();
  }

  @Override
  public String listarContenidos() {
    String str = "Listado de Carreras de la Facultad " + this.nombre + "\n";
    for (Carrera o : this.colCarreras) {
      str += o + "\n";
    }
    return str;
  }

  public void agergarCarrera(Carrera carrera) {
    this.colCarreras.add(carrera);
  }

  public void removerCarrera(String nombreCarrera) {
    boolean contiene = false;
    for (Carrera o : colCarreras) {
      if (o.getNombre() == nombreCarrera) {
        this.colCarreras.remove(o);
        contiene = true;
      }
    }

    if (contiene)
      System.out.println("Carrera removida de la lista");
    else
      System.out.println("!La carrera no se encuentra en la lista: " + this.colCarreras.toString());
  }

}
