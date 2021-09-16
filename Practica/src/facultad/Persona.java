package facultad;

public abstract class Persona {
  public String nombre;
  public String apellido;
  public int lejago;

  public Persona(String name, String apellido, int lejago) {
    this.nombre = name;
    this.apellido = apellido;
    this.lejago = lejago;
  }

  public abstract void modificarDatos();

  @Override
  public String toString() {
    return "Persona [apellido=" + apellido + ", lejago=" + lejago + ", nombre=" + nombre + "]";
  }

}
