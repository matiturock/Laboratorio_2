package inicio.udemy.clasesabstractas.test;

import inicio.udemy.clasesabstractas.FiguraGeometrica;
import inicio.udemy.clasesabstractas.Rectangulo;

public class TestFigura {
  public static void main(String[] args) {
    FiguraGeometrica rect1 = new Rectangulo("rectangulo");
    rect1.dibujar();
  }
}
