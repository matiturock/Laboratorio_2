package tgn1;

public class Acomodador extends Empleado implements ParaAcomodadores {

  private Sala sala;

  public Acomodador(String nombre, Integer edad, double sueldo, Sala sala) {
    super(nombre, edad, sueldo);
    this.sala = sala;
  }

  @Override
  public Sala getSala() {
    return sala;
  }

  @Override
  public void setSala(Sala sala) {
    this.sala = sala;
  }

}
