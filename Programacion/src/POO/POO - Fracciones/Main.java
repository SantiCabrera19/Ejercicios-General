import java.util.Scanner;

public class Main {
    // creo un scanner
    Scanner input = new Scanner(System.in);

    // main para ejecutar
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(10, 1);
        Fraccion fraccion2 = new Fraccion(5, 1);

        Fraccion suma = fraccion1.sumar(fraccion2);
        System.out.println("Suma: " + suma);

        Fraccion producto = fraccion1.multiplicar(fraccion2);
        System.out.println("Producto: " + producto);
    }
}
