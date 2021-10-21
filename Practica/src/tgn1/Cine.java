package tgn1;

import java.util.ArrayList;
import java.util.List;
import tgn1.utils.ValidacionDatos;

public class Cine {
  public static void main(String[] args) {

    Sala sala1 = new Sala(3, "Sala 01");
    sala1.setPelicula("Jocker");
    System.out.println(sala1);

    Espectador esp1 = new Espectador("Mati", 31, "A", 1);
    Espectador esp2 = new Espectador("Antonella", 32, "B", 1);

    List<Espectador> espectadroes = new ArrayList<>();
    espectadroes.add(esp1);
    espectadroes.add(esp2);

    sala1.setEspectadores(espectadroes);

    System.out.println(sala1); // con espectadores

    System.out.println("Tipo: " + esp1.getTipo());

    Empleado emp1 = new Empleado("Luciano", 31, 50_000);
    System.out.println(emp1);
    emp1.setSueldo(100_000);
    System.out.println(emp1);

    Acomodador acom1 = new Acomodador("Claudio", 35, 30_000, sala1);
    System.out.println(acom1);
    acom1.setSueldo(50_000);
    System.out.println(acom1);

    // cargar espectador
    Espectador esp3 = ValidacionDatos.crearEspectador();
    if (esp3 != null)
      espectadroes.add(esp3);
    else
      System.out.println("No se pudo agregar espectador");

    System.out.println(sala1);

  }
}
