package test.mundopc;

public class Monitor {
  private final int ID_MONITOR;
  private String marca;
  private float tamaño;
  private static int contadorMonitores;

  private Monitor() {
    this.ID_MONITOR = ++Monitor.contadorMonitores;
  }

  public Monitor(String marca, float tamaño) {
    this();
    this.marca = marca;
    this.tamaño = tamaño;
  }

  @Override
  public String toString() {
    return "Monitor [idMonitor=" + ID_MONITOR + ", marca=" + marca + ", tamaño=" + tamaño + "]";
  }

  public int getIdMonitor() {
    return this.ID_MONITOR;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public float getTamaño() {
    return this.tamaño;
  }

  public void setTamaño(float tamaño) {
    this.tamaño = tamaño;
  }

}
