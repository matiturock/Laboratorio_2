package desafio10;

import javax.swing.JOptionPane;

public class AdivinaElNumero {

  static int numeroUsuario = 0;
  static int cantidadIntentos = 0;
  static int numeroOculto = (int) (Math.random() * 100);

  public static void main(String[] args) {

    JOptionPane.showMessageDialog(null, "Existe un número oculto entre 1 y 100. Adivínalo!");
    jugarAdivinarNumero();

  }

  public static void jugarAdivinarNumero() {
    do {
      numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un entero entre 1 y 100"));

      if (numeroOculto > numeroUsuario) {
        JOptionPane.showMessageDialog(null, "El número oculto es mayor");
      } else if (numeroOculto < numeroUsuario) {
        JOptionPane.showMessageDialog(null, "El número oculto es menor");
      }
      cantidadIntentos++;

    } while (numeroOculto != numeroUsuario);

    JOptionPane.showMessageDialog(null, String.format("Correcto! Lo has logrado en %d intentos.", cantidadIntentos));
  }
}