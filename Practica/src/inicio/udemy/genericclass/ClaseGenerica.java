package inicio.udemy.genericclass;

public class ClaseGenerica<T> {
  private T obj;

  public ClaseGenerica(T obj) {
    this.obj = obj;
  }

  public void getTipo() {
    System.out.println("El tipo T es: " + this.obj.getClass().getSimpleName());
  }
}
