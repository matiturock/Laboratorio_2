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
    String nombre = ValidacionDatos.ingresarSoloLetras(s);
    this.setNombre(nombre);
    System.out.println("Ingresa el apellido:");
    String apellido = ValidacionDatos.ingresarSoloLetras(s);
    this.setApellido(apellido);
    System.out.println("Ingresa el legajo:");
    int legajo = ValidacionDatos.ingresarLegajo(s);
    this.setLegajo(legajo);
    System.out.println("Datos actualizados!");
    System.out.println(this.toString());

    s.close();
  }

  @Override
  public String toString() {
    return "Estudiante:\n" + super.toString();
  }

}
