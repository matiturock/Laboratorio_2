package test;

import java.util.Scanner;

public class Matrices {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] array = new int[3];
    int[][] matriz = new int[3][4];

    System.out.println("Array");
    for (int i : array) {
      System.out.print(i);
    }

    // mostrarMatriz(matriz);

    for (int row = 0; row < matriz.length; row++) {
      for (int col = 0; col < matriz[row].length; col++) {
        matriz[row][col] = (int) (Math.random() * 10);
      }
    }

    // mostrarMatriz(matriz);

    String[][] frutas = new String[2][2];

    for (int row = 0; row < frutas.length; row++) {
      for (int col = 0; col < frutas.length; col++) {
        System.out.println("Ingresa el nombre de la fruta en la posición " + row + "-" + col);
        frutas[row][col] = s.nextLine();
      }
    }

    mostrarMatriz(frutas);

    s.close();
  }

  private static void mostrarMatriz(Object[][] matriz) {
    System.out.println("\nMatriz");
    for (Object[] i : matriz) {
      for (Object j : i) {
        System.out.print(j + " ");
      }
      System.err.println();
    }
  }
}
