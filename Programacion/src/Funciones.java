import java.util.Scanner;

//  Clase Main
public class Funciones {

    public static void main(String args[]) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variables
        int num1, num2, resultado;
        // Numero 1
        System.out.print("Ingrese el numero 1: ");
        num1 = input.nextInt();
        // Numero 2
        System.out.print("Ingrese el numero 2: ");
        num2 = input.nextInt();
        // Llamamos la funcion
        resultado = sumarEnteros(num1, num2); // paso parametro por referencia
        // Mostramos el resultado
        System.out.print("el resultado es: " + resultado);
    }

    private static int sumarEnteros(int a, int b){
        return a + b;
        // Aqui ya termina la funcion, cosas aqui no se ejecutaran
    }

}
