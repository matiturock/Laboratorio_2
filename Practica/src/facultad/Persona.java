package facultad;

public abstract class Persona {
  private String nombre;
  private String apellido;
  private int legajo;

  public Persona(String name, String apellido, int lejago) {
    this.nombre = name;
    this.apellido = apellido;
    this.legajo = lejago;
  }

  public abstract void modificarDatos();

  @Override
  public String toString() {
    String str = String.format("\t-> Nombre completo: %s, %s\n" + "\t-> Legajo: %d\n", this.apellido.toUpperCase(),
        this.nombre, this.legajo);
    return str;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getLejago() {
    return legajo;
  }

  public void setLegajo(int lejago) {
    this.legajo = lejago;
  }

}
