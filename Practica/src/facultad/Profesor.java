package facultad;

import java.util.Scanner;

public class Profesor extends Persona {
  private double basico;
  private int antiguedad;

  public Profesor(String name, String apellido, int lejago, double basico, int antiguedad) {
    super(name, apellido, lejago);
    this.basico = basico;
    this.antiguedad = antiguedad;
  }

  @Override
  public void modificarDatos() {
    Scanner s = new Scanner(System.in);

    System.out.println("Modificando datos de: " + this.toString());
    System.out.println("Ingresa el nombre:");
    String nombre = s.nextLine();
    this.setNombre(nombre);
    System.out.println("Ingresa el apellido:");
    String apellido = s.nextLine();
    this.setApellido(apellido);
    System.out.println("Ingresa el legajo:");
    int legajo = s.nextInt();
    this.setLegajo(legajo);
    System.out.println("Ingresa la antigüedad:");
    int antiguedad = s.nextInt();
    this.setAntiguedad(antiguedad);
    System.out.println("Ingresa el basico:");
    double basico = s.nextDouble();
    this.setBasico(basico);
    System.out.println("Datos actualizados!");

    s.close();
  }

  @Override
  public String toString() {
    return "Profesor [" + super.toString() + ", básico=$" + this.basico + ", antigüedad=" + this.antiguedad + "]\n";
  }

  public double calcularSueldo() {
    double sueldo = this.antiguedad * this.basico;
    return sueldo;
  }

  public double getBasico() {
    return basico;
  }

  public void setBasico(double basico) {
    this.basico = basico;
  }

  public int getAntiguedad() {
    return antiguedad;
  }

  public void setAntiguedad(int antiguedad) {
    this.antiguedad = antiguedad;
  }

}
