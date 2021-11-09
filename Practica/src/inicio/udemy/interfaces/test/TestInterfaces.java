package inicio.udemy.interfaces.test;

import inicio.udemy.interfaces.IAccesoDatos;
import inicio.udemy.interfaces.ImplementacionMySql;
import inicio.udemy.interfaces.ImplementacionOracle;

public class TestInterfaces {
  public static void main(String[] args) {
    IAccesoDatos datos1 = new ImplementacionMySql();
    datos1.crear();

    IAccesoDatos datos2 = new ImplementacionOracle();
    datos2.leer();
  }
}
