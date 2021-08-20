public class App {
    public static void main(String[] args) {
        String nombre = "Matías";
        int edad = 31;
        float salario = 120.50f;
        boolean carnet = true;

        System.out
                .println(String.format("Nombre: %s, Edad: %d, Salario: $%.2f, Carnet: %b", nombre, edad, salario, carnet));
    }
}
