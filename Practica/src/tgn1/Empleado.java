package tgn1;

public class Empleado extends Persona {
  private double sueldo;

  public Empleado(String nombre, Integer edad, double sueldo) {
    super(nombre, edad);
    this.sueldo = sueldo;
  }

  @Override
  public String toString() {
    return "Empleado [sueldo=" + sueldo + "]";
  }

  @Override
  public String getTipo() {
    return super.toString() + this.toString();
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

}
