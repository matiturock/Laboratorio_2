package desafio8;

import java.util.Scanner;

public class RaizScanner {
  public static void main(String[] args) {
    System.out.println("Intoduce un número: ");
    Scanner s = new Scanner(System.in);
    int numero = s.nextInt();
    double raiz = calcularRaiz(numero);
    System.out.println(String.format("La raiz de %d es %.2f", numero, raiz));
  }

  private static double calcularRaiz(int numero) {
    return Math.sqrt(numero);
  }
}
