package udemy.interfaces;

public class ImplementacionMySql implements IAccesoDatos {

  @Override
  public void crear() {
    System.out.println("Crear registro desde MySQL");
  }

  @Override
  public void leer() {
    System.out.println("Leer registro desde MySQL");
  }

  @Override
  public void actualizar() {
    System.out.println("Actualizara desde MySQL");
  }

  @Override
  public void borrar() {
    System.out.println("Borrar desde MySQL");
  }

}
