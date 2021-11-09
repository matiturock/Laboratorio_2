package udemy.excepciones1.test;

import udemy.excepciones1.aritmetica.Aritmetica;

public class TestExcepciones {
  public static void main(String[] args) {
    Integer resultado = null;

    try {
      resultado = Aritmetica.division(10, 0);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Resultado: " + resultado);
  }
}
