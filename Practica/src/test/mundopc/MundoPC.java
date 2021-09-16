package test.mundopc;

public class MundoPC {
  public static void main(String[] args) {
    Mouse mouse1 = new Mouse("USB", "Logitech");
    Teclado teclado1 = new Teclado("USB", "Genius");
    Monitor moni1 = new Monitor("Samsung", (float) 27.5);

    Computadora compu1 = new Computadora("Gamer", moni1, teclado1, mouse1);

    Mouse mouse2 = new Mouse("USB", "Steelseries");
    Teclado teclado2 = new Teclado("USB", "Corsair");
    Monitor moni2 = new Monitor("LG", (float) 32.0);

    Computadora compu2 = new Computadora("Oficina", moni2, teclado2, mouse2);

    Orden orden1 = new Orden();
    orden1.agergarComputadora(compu1);
    orden1.agergarComputadora(compu2);

    orden1.mostrarOrden();
  }
}
