package inicio.udemy.castingobjetos.test;

import inicio.udemy.castingobjetos.*;

public class TestConversionObjetos {
  public static void main(String[] args) {
    Empleado emp = new Escritor("Gabriel", 50_000, TipoEscritura.CLASICO);
    System.out.println(emp);
    System.out.println(emp.mostrarDatos());

    TipoEscritura tipoEsc = ((Escritor) emp).getTipoEscritura();
    System.out.println(tipoEsc);

    // la otra forma de casatear es asignanado a una variable:
    // Escritor nuevoEscritor = (Escritor) emp;
    // y de ahí trabajar sobre la variable 'nuevoEscritor'
    // UPCASTING: no es necsario hacer una conversión explícita, ya que java hace
    // que herede de solo una clase
    // DONWCASTING: es necesario indicar al tipo de dato que se desea castear

    Empleado emp1 = new Empleado("Matías", 300);
    Empleado emp2 = new Empleado("Matías", 300);

    if (emp1 == emp2) {
      System.out.println("Comparten la misma referencia en memoria");
    } else {
      System.out.println("No comparaten la misma referencia en memoria");
    }

    if (emp1.equals(emp2)) {
      System.out.println("Los dos objetos son del mismo tipo y tienen el mismo contenido");
    } else {
      System.out.println("Los objetos son de distinto tipo o tienen distinto contenido");
    }

    if (emp1.hashCode() == emp2.hashCode()) {
      System.out.println(emp1.hashCode());
      System.out.println("Tienen mismo hash code, porque se genera a partir de los atributos de los objetos");
    } else {
      System.out.println("No tienen mismo hash code");
    }
  }
}
