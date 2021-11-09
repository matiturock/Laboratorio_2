package inicio.udemy.clasesabstractas;

public class Rectangulo extends FiguraGeometrica {

  public Rectangulo(String tipoFigura) {
    super(tipoFigura);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void dibujar() {
    // TODO Auto-generated method stub
    System.out.println("Dibujando un " + this.getClass().getSimpleName());
  }

}
