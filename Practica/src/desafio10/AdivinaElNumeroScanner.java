package desafio10;

import java.util.Scanner;

public class AdivinaElNumeroScanner {
  public static void main(String[] args) {
    int numeroOculto, numeroUsuario, cantidadIntentos = 0;

    numeroOculto = (int) (Math.random() * 100);

    System.out.println("Existe un número oculto entre 1 y 100. Adivínalo!");

    do {
      System.out.println("Ingresa un número entero:");
      numeroUsuario = pedirNumeroUsuario();

      if (numeroOculto > numeroUsuario) {
        System.out.println("El número oculto es mayor");
      } else if (numeroOculto < numeroUsuario) {
        System.out.println("El número oculto es menor");
      }
      cantidadIntentos++;

    } while (numeroOculto != numeroUsuario);

    System.out.println(String.format("Correcto! Lo has logrado en %d intentos.", cantidadIntentos));
  }

  private static int pedirNumeroUsuario() {
    Scanner scan = new Scanner(System.in);
    int numeroUsuario = Integer.parseInt(scan.nextLine());
    scan.close();
    return numeroUsuario;
  }
}