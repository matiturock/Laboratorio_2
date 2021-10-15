package tgn1.generators;

import java.util.List;

import tgn1.Espectador;
import tgn1.Sala;

public class Inicializdores {

  public static Sala crearSala(List<Espectador> listaEspectadores) {
    Sala nuevaSala = new Sala(5, "Sala 1");
    nuevaSala.setEspectadores(listaEspectadores);
    return nuevaSala;
  }

}
