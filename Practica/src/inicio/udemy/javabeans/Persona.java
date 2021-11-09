package inicio.udemy.javabeans;

// implementa la interfaz serilizable
import java.io.Serializable;

public class Persona implements Serializable {
  // es requerido que los atributos sean privados
  private String nombre;
  private Integer edad;

  // y tener un constructor público y vacío
  public Persona() {
  }

  public Persona(String nombre, Integer edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  @Override
  public String toString() {
    return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((edad == null) ? 0 : edad.hashCode());
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Persona other = (Persona) obj;
    if (edad == null) {
      if (other.edad != null)
        return false;
    } else if (!edad.equals(other.edad))
      return false;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    return true;
  }

}
