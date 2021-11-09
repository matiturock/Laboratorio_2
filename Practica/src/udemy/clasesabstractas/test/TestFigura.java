package udemy.clasesabstractas.test;

import udemy.clasesabstractas.FiguraGeometrica;
import udemy.clasesabstractas.Rectangulo;

public class TestFigura {
  public static void main(String[] args) {
    FiguraGeometrica rect1 = new Rectangulo("rectangulo");
    rect1.dibujar();
  }
}
