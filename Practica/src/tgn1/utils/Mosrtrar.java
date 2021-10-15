package tgn1.utils;

import java.util.List;

import tgn1.Espectador;

public class Mosrtrar {

  public static void mostrarEspectadores(List<Espectador> listaEspectadores) {
    System.out.println("\nMostrando lista de espectadores:");

    if (listaEspectadores.size() == 0)
      System.out.println("No hay espectadores cargados.");
    else {
      for (Espectador espectador : listaEspectadores) {
        System.out.println("->" + espectador);
      }
    }
  }

  public static void mostrarMenuPrincipal() {
    // MENU
    System.out.println(">>> Programa Gestión de Cine");
    System.out.println("MENU - Elige una opción");

    // TODO mostrar cant de salas, cant de espectadores
    System.out.println("1 - Mostrar estado de Cine");
    System.out.println("2 - Crear Sala");

    // TODO asignar espectador a fila y butaca
    System.out.println("3 - Crear Espectador");
    System.out.println("4 - Mostrar Espectador");

    System.out.println("5 - Crear Empleado");
    System.out.println("6 - Mostrar Empleados");

    System.out.println("7 - Crear Acomodador");
    System.out.println("8 - Mostrar Acomodador");

    System.out.println("0 - Terminar programa");
  }

}
