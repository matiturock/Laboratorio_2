package test.mundopc;

public class Mouse extends DispositivoEntrada {
  private final int ID_MOUSE;
  private static int contadorMouses;

  public Mouse(String tipoEntrada, String marca) {
    super(tipoEntrada, marca);
    this.ID_MOUSE = ++Mouse.contadorMouses;
  }

  @Override
  public String toString() {
    return "Mouse [idMouse=" + ID_MOUSE + super.toString() + "]";
  }
}
