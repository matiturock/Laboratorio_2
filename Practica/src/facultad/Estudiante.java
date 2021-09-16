package facultad;

import java.util.Scanner;

public class Estudiante extends Persona {

  public Estudiante(String name, String apellido, int lejago) {
    super(name, apellido, lejago);
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
    System.out.println("Datos actualizados!");

    s.close();
  }

  @Override
  public String toString() {
    return "Estudiante [" + super.toString() + "]";
  }

}
