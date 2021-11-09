package udemy.castingobjetos;

public class Escritor extends Empleado {
  final TipoEscritura tipoEscritura;

  public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
    super(nombre, sueldo);
    this.tipoEscritura = tipoEscritura;
  }

  @Override
  public String mostrarDatos() {
    // TODO Auto-generated method stub
    return super.mostrarDatos() + " - Tipo de escritura: " + tipoEscritura.getDescripcion();
  }

  @Override
  public String toString() {
    return super.toString() + " es Escritor [tipoEscritura=" + tipoEscritura + "]";
  }

  public TipoEscritura getTipoEscritura() {
    return tipoEscritura;
  }

}
