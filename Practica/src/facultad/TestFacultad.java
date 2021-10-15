package facultad;

import java.util.ArrayList;

class TestFacultad {
  public static void main(String[] args) {
    Profesor profe1 = new Profesor("Facundo", "Uferer", 123, 60_000, 3);
    Estudiante est1 = new Estudiante("Matías", "Almirón", 25_900);
    Estudiante est2 = new Estudiante("Maxi", "Insfran", 26_000);

    ArrayList<Estudiante> colEstudiantes = new ArrayList<>();
    colEstudiantes.add(est1);
    colEstudiantes.add(est2);

    Materia materia1 = new Materia("Laboratorio", profe1, colEstudiantes);
    Materia materia2 = new Materia("Programación", profe1, colEstudiantes);
    ArrayList<Materia> colMaterias = new ArrayList<>();
    colMaterias.add(materia1);
    colMaterias.add(materia2);

    Carrera carrera1 = new Carrera("Tecnicatura Universitaria en Programación", colMaterias);

    System.out.println(carrera1);

    ArrayList<Carrera> colCarreras = new ArrayList<>();
    colCarreras.add(carrera1);

    Facultad facultad1 = new Facultad("UTN FRRe", colCarreras);
    System.out.println(facultad1);

    System.out.println(materia1.listarContenidos());
    System.out.println(materia2.listarContenidos());
    System.out.println(carrera1.listarContenidos());
    System.out.println(facultad1.listarContenidos());

    est1.modificarDatos();
  }

}
