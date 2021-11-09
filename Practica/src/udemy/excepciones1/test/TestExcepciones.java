package udemy.excepciones1.test;

public class TestExcepciones {
  public static void main(String[] args) {
    Integer resultado = null;

    try {
      resultado = 10 / 0;
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Resultado: " + resultado);
  }
}
