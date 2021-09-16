package test;

public class Matrices {
  public static void main(String[] args) {
    int[] array = new int[4];
    int[][] matrices = new int[2][3];

    System.out.println("\nArray");

    for (int i : array) {
      System.out.print(i);
      System.out.print(" ");
    }

    System.out.println("\n\nMatriz");

    for (int[] i : matrices) {
      for (int j : i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
