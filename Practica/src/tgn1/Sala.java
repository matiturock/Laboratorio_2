package tgn1;

import java.util.List;

public class Sala {
  private Integer capacidad;
  private String pelicula;
  private String nombre;
  private List<Espectador> espectadores;

  public Sala(Integer capacidad, String nombre) {
    this.capacidad = capacidad;
    this.nombre = nombre;
  }

  public void setPelicula(String pelicula) {
    this.pelicula = pelicula;
  }

  public Integer getCapacidad() {
    return this.capacidad;
  }

  public List<Espectador> getEspectadores() {
    return espectadores;
  }

  public void setEspectadores(List<Espectador> espectadores) {
    this.espectadores = espectadores;
  }

  public String getNombre() {
    return nombre;
  }

  @Override
  public String toString() {
    if (espectadores == null) {
      return "Sala [capacidad=" + capacidad + ", espectadores=SIN ESPECTADORES CARGADOS" + ", nombre=" + nombre
          + ", pelicula=" + pelicula + "]";
    }
    if (espectadores.size() == 0) {
      return "Sala [capacidad=" + capacidad + ", espectadores=ESPECTADORES CARGADOS = 0" + ", nombre=" + nombre
          + ", pelicula=" + pelicula + "]";
    }
    return "Sala [capacidad=" + capacidad + ", espectadores=" + espectadores.toString() + ", nombre=" + nombre
        + ", pelicula=" + pelicula + "]";
  }

}
