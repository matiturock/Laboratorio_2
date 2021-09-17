package facultad;

import java.util.ArrayList;

public class TestFacultad {
  public static void main(String[] args) {
    Profesor profe1 = new Profesor("Facundo", "Uferer", 123, 60_000, 3);
    Estudiante est1 = new Estudiante("Matías", "Almirón", 25_900);
    Estudiante est2 = new Estudiante("Maxi", "Insfran", 26_000);

    ArrayList<Estudiante> colEstudiantes = new ArrayList<>();
    colEstudiantes.add(est1);
    colEstudiantes.add(est2);

    Materia materia1 = new Materia("Laboratorio", profe1, colEstudiantes);

    System.out.println(materia1);
  }
}
