package tgn1;

import java.util.List;

import tgn1.utils.ValidacionDatos;

public class Espectador extends Persona {
  private String fila;
  private Integer butaca;

  public Espectador(String nombre, Integer edad, String fila, Integer butaca) {
    super(nombre, edad);
    this.fila = fila;
    this.butaca = butaca;
  }

  public Integer getSilla() {
    return butaca;
  }

  @Override
  public String toString() {
    return super.toString() + " es Espectador [butaca=" + butaca + ", fila=" + fila + "]";
  }

  @Override
  public String getTipo() {
    return String.valueOf(this.getClass());
  }

  static void cargarEspectdores(List<Espectador> listaEspectadores, Sala sala) {
    if (sala.getEspectadores().size() >= sala.getCapacidad())
      System.out.println("No se puede agregar más espectadores a la sala");
    else {
      Espectador nuevoEspectador = ValidacionDatos.crearEspectador();
      if (nuevoEspectador != null) {
        listaEspectadores.add(nuevoEspectador);
        System.out.println("Espectador agregado!");
      } else
        System.out.println("No se pudo agregar espectador.");
    }
  }

}
