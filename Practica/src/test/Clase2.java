package test;

public class Clase2 extends Clase1 {
  @Override
  public void metodo1() {
    super.metodo1();
    System.out.println(muchosDatos);
  }

  String muchosDatos = "Muchos datos";
}
