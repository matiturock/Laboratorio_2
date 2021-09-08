package desafio11;

public class UsoDeCuenta {
  public static void main(String[] args) {
    CuentaCorriente cuenta1 = new CuentaCorriente(3_000, "Matías");
    CuentaCorriente cuenta2 = new CuentaCorriente(5_000, "Antonella");

    cuenta1.mostrarInformacionDeCuenta();
    cuenta2.mostrarInformacionDeCuenta();

    cuenta1.transferirDinero(cuenta2, 2_500);
  }
}
