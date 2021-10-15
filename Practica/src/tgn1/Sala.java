package tgn1;

import java.util.Arrays;

public class Sala {
  private Integer capacidad;
  private String pelicula;
  private String nombre;
  private Espectador[] espectadores;

  public Sala(Integer capacidad, String nombre) {
    this.capacidad = capacidad;
    this.nombre = nombre;
  }

  public void setPelicula(String pelicula) {
    this.pelicula = pelicula;
  }

  public Espectador[] getEspectadores() {
    return espectadores;
  }

  public void setEspectadores(Espectador[] espectadores) {
    this.espectadores = espectadores;
  }

  @Override
  public String toString() {
    return "Salas [capacidad=" + capacidad + ", espectadores=" + Arrays.toString(espectadores) + ", nombre=" + nombre
        + ", pelicula=" + pelicula + "]";
  }

}
