package tgn1;

import java.util.ArrayList;
import java.util.List;

import tgn1.utils.ValidacionDatos;

public class Cine {
  public static void main(String[] args) {
    List<Espectador> listaEspectadores = new ArrayList<>();

    cargarEspectdores(listaEspectadores);

    mostrarEspectadores(listaEspectadores);
  }

  private static void mostrarEspectadores(List<Espectador> listaEspectadores) {
    System.out.println("\nMostrando lista de espectadores:");

    if (listaEspectadores.size() == 0)
      System.out.println("No hay espectadores cargados.");
    else {
      for (Espectador espectador : listaEspectadores) {
        System.out.println("->" + espectador);
      }
    }
  }

  private static void cargarEspectdores(List<Espectador> listaEspectadores) {
    Espectador nuevoEspectador = ValidacionDatos.crearEspectador();
    if (nuevoEspectador != null) {
      listaEspectadores.add(nuevoEspectador);
      System.out.println("Espectador agregado!");
    } else
      System.out.println("No se pudo agregar espectador.");
  }
}
