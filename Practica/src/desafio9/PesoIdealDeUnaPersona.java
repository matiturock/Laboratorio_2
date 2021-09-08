package desafio9;

import java.util.Scanner;

public class PesoIdealDeUnaPersona {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Este programa indica si usted está en su peso ideal.");

    System.out.println("Ingrese su altura en centímetros:");
    int altura = scan.nextInt();

    System.out.println("Indique su género H-hombre / M-mujer:");
    String generoStr = scan.nextLine().toLowerCase();
    char generoChar = generoStr.charAt(0);

    scan.close();

    float pesoIdeal = calcularPesoIdeal(altura, generoChar);

    mostrarPesoIdeal(pesoIdeal);
  }

  private static float calcularPesoIdeal(int altura, char genero) {
    if (genero == 'h')
      return altura - 110;
    else if (genero == 'm')
      return altura - 120;
    else
      return 0;
  }

  private static void mostrarPesoIdeal(float pesoIdeal) {
    if (pesoIdeal == 0)
      System.out.println("Datos ingresados incorrectos.");
    else
      System.out.println(String.format("Tu peso ideal es de %.2f kilogramos.", pesoIdeal));
  }
}
