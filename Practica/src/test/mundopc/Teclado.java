package test.mundopc;

public class Teclado extends DispositivoEntrada {
  private final int ID_TECLADO;
  private static int contadorTeclado;

  public Teclado(String tipoEntrada, String marca) {
    super(tipoEntrada, marca);
    this.ID_TECLADO = ++Teclado.contadorTeclado;
  }

  @Override
  public String toString() {
    return "Teclado [idTeclaldo=" + ID_TECLADO + super.toString() + "]";
  }
}
