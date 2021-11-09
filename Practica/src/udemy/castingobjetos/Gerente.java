package udemy.castingobjetos;

public class Gerente extends Empleado {
  private String departamento;

  public Gerente(String nombre, double sueldo, String departamento) {
    super(nombre, sueldo);
    this.departamento = departamento;
  }

  @Override
  public String mostrarDatos() {
    return super.mostrarDatos() + String.format(" | Departamento: %s", this.departamento);
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

}
