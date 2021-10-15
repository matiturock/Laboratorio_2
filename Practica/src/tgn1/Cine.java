package tgn1;

import java.util.ArrayList;
import java.util.List;

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
    String nombre = IngresoDatos.ingresarNombre();
    if (nombre == null)
      return;

    Integer edad = IngresoDatos.ingresarEdad();
    if (edad == null)
      return;

    String letraFila = IngresoDatos.ingresarFila();
    if (letraFila == null)
      return;

    Integer nroButaca = IngresoDatos.IngresarButaca();
    if (nroButaca == null)
      return;

    Espectador nuevoEspectador = new Espectador(nombre, edad, letraFila, nroButaca);
    listaEspectadores.add(nuevoEspectador);
    System.out.println("Espectador agregado!");
  }
}
