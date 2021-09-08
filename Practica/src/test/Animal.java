package test;

public class Animal {
  private String nombre;

  public Animal(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }
}

class Perros extends Animal {
  public Perros(String nombre) {
    super(nombre);
  }
}
