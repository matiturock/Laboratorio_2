package udemy.excepciones1.aritmetica;

import udemy.excepciones1.OperacionExcepcion;

public class Aritmetica {
  public static int division(int numerador, int denominador) throws OperacionExcepcion {
    if (denominador == 0) {
      throw new OperacionExcepcion("Division entre 0");
    }

    return numerador / denominador;
  }
}
