package udemy.clasesabstractas;

public abstract class FiguraGeometrica {
  protected String tipoFigura;

  FiguraGeometrica(String tipoFigura) {
    this.tipoFigura = tipoFigura;
  }

  public abstract void dibujar();

  public String getTipoFigura() {
    return tipoFigura;
  }

  public void setTipoFigura(String tipoFigura) {
    this.tipoFigura = tipoFigura;
  }

}
