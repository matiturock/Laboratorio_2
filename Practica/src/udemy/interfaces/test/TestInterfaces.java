package udemy.interfaces.test;

import udemy.interfaces.IAccesoDatos;
import udemy.interfaces.ImplementacionMySql;
import udemy.interfaces.ImplementacionOracle;

public class TestInterfaces {
  public static void main(String[] args) {
    IAccesoDatos datos1 = new ImplementacionMySql();
    datos1.crear();

    IAccesoDatos datos2 = new ImplementacionOracle();
    datos2.leer();
  }
}
