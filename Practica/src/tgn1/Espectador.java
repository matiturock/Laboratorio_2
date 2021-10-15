package tgn1;

public class Espectador extends Persona {
  private String fila;
  private Integer butaca;

  public Espectador(String nombre, Integer edad, String fila, Integer butaca) {
    super(nombre, edad);
    this.fila = fila;
    this.butaca = butaca;
  }

  public Integer getSilla() {
    return butaca;
  }

  @Override
  public String toString() {
    return "Espectadores [butaca=" + butaca + ", fila=" + fila + "]";
  }

  @Override
  public String getTipo() {
    return super.toString() + this.toString();
  }

}
