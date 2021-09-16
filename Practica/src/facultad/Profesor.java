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

    System.out.println("Modificando datos de Estudiante:");
    System.out.println("Ingresa el nombre:");
    this.nombre = s.nextLine();
    System.out.println("Ingresa el apellido:");
    this.apellido = s.nextLine();
    System.out.println("Ingresa el legajo:");
    this.lejago = s.nextInt();
    System.out.println("Ingresa el básico:");
    this.basico = s.nextDouble();
    System.out.println("Ingresa la antigüedad:");
    this.antiguedad = s.nextInt();
    System.out.println("Datos actualizados!");

    s.close();
  }

  @Override
  public String toString() {
    return "Profesor [" + super.toString() + "]";
  }

  public double calcularSueldo() {
    double sueldo = this.antiguedad * this.basico;
    return sueldo;
  }

}
