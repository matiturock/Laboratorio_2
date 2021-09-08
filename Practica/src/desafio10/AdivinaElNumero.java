package desafio10;

import javax.swing.JOptionPane;

public class AdivinaElNumero {
  public static void main(String[] args) {
    int numeroOculto, numeroUsuario, cantidadIntentos = 0;

    numeroOculto = (int) (Math.random() * 100);

    JOptionPane.showMessageDialog(null, "Existe un número oculto entre 1 y 100. Adivínalo!");

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