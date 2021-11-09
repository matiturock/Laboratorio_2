package udemy.javabeans.test;

import udemy.javabeans.Persona;

public class JavaBeans {
  public static void main(String[] args) {
    // con esto estamos formalizando el uso de un javabeans
    Persona per1 = new Persona();
    per1.setNombre("Antonella");
    per1.setEdad(32);

    System.out.println(per1);
  }
}
