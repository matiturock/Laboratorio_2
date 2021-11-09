package udemy.interfaces;

public interface IAccesoDatos {
  int MAX_REGISTROS = 10;

  void crear();

  void leer();

  void actualizar();

  void borrar();
}
