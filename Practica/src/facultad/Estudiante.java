package facultad;

import java.util.Scanner;

public class Estudiante extends Persona {

  public Estudiante(String name, String apellido, int lejago) {
    super(name, apellido, lejago);
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
    System.out.println("Datos actualizados!");

    s.close();
  }

  @Override
  public String toString() {
    return "Estudiante:\n" + super.toString();
  }

}
