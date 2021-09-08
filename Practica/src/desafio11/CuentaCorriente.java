package desafio11;

public class CuentaCorriente {
  private double saldo;
  private String nombreTitular;
  private long numeroCuenta;

  public CuentaCorriente(double saldo, String nombreTitular) {
    this.setSaldo(saldo);
    this.setNombreTitular(nombreTitular);
    this.numeroCuenta = (int) (Math.random() * 1_000_000);
  }

  public long getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(long numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public String getNombreTitular() {
    return nombreTitular;
  }

  public void setNombreTitular(String nombreTitular) {
    this.nombreTitular = nombreTitular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void mostrarInformacionDeCuenta() {
    System.out.println("Cuenta Corriente Nro " + this.getNumeroCuenta());
    System.out.println("-> Nombre del Titular: " + this.getNombreTitular());
    System.out.println("-> Saldo: $" + this.getSaldo());
  }

  public void transferirDinero(CuentaCorriente cuentaDestino, double monto) {
    if (this.getSaldo() >= monto) {
      cuentaDestino.setSaldo(cuentaDestino.getSaldo() + monto);
      this.setSaldo(this.getSaldo() - monto);
      System.out.println("Transferencia realizada con éxito.");
      System.out.println("INFORMACIÓN DE CUENTA DE ORIGEN:");
      this.mostrarInformacionDeCuenta();
      System.out.println("INFORMACIÓN DE CUENTA DESTINO:");
      cuentaDestino.mostrarInformacionDeCuenta();
    } else {
      System.out.println("SALDO INSUFICIENTE PARA REALIZAR LA TRANSFERENCIA.");
      this.mostrarInformacionDeCuenta();
    }
  }
}
