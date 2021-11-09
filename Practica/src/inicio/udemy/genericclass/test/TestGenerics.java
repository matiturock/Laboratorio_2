package inicio.udemy.genericclass.test;

import inicio.udemy.genericclass.ClaseGenerica;

public class TestGenerics {
  public static void main(String[] args) {
    ClaseGenerica<Integer> variableInt = new ClaseGenerica<Integer>(15);
    variableInt.getTipo();

    ClaseGenerica<String> variableStr = new ClaseGenerica<String>("mati");
    variableStr.getTipo();
  }
}
