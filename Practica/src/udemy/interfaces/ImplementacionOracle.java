package udemy.interfaces;

public class ImplementacionOracle implements IAccesoDatos {

  @Override
  public void crear() {
    System.out.println("Crear registro desde Oracle");
  }

  @Override
  public void leer() {
    System.out.println("Leer registro desde Oracle");
  }

  @Override
  public void actualizar() {
    System.out.println("Actualizara desde Oracle");
  }

  @Override
  public void borrar() {
    System.out.println("Borrar desde Oracle");
  }

}
