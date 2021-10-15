package tgn1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tgn1.generators.Inicializdores;
import tgn1.utils.Mosrtrar;

public class Cine {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Integer choice = -1;

    do {
      Mosrtrar.mostrarMenuPrincipal();

      Integer opcion = Integer.parseInt(scan.nextLine());

      switch (opcion) {
        case 0:
          System.out.println("Fin del programa...");
          System.exit(0);
          break;

        case 1:
          System.out.println("Mostrando estado de Cine:");
          System.exit(0);
          break;

        case 2:
          System.out.println("Creando sala:");
          List<Espectador> espectadores = new ArrayList<>();
          Sala sala1 = Inicializdores.crearSala(espectadores); // creada sala 1 con los atributos pedidos en la consigna
          sala1.setPelicula("Joker");

        default:
          System.out.println("Opción incorrecta.");
          break;
      }
    } while (choice != 0);

    scan.close();
  }
}
