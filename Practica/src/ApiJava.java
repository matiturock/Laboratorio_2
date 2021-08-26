public class ApiJava {
    public static void main(String[] args) {
        double angulo = 45;
        int numero = 3;

        // Funciones trigonométricas
        System.out.println(Math.sin(angulo));
        System.out.println(Math.cos(angulo));
        System.out.println(Math.tan(angulo));
        System.out.println(Math.atan(angulo));

        // La función exponencial y su inversa
        System.out.println(Math.exp(numero)); // Returns Euler's number e raised to the power of a double value
        System.out.println(Math.log(numero)); // Returns the natural logarithm (base e) of a double value

        // Las dos constantes PI y e
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}
