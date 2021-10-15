package tgn1;

public class Empleado extends Persona {
  private double sueldo;

  public Empleado(String nombre, Integer edad, double sueldo) {
    super(nombre, edad);
    this.sueldo = sueldo;
  }

  @Override
  public String toString() {
    return super.toString() + " es Empleado [sueldo=" + sueldo + "]";
  }

  @Override
  public String getTipo() {
    return String.valueOf(this.getClass());
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

}
