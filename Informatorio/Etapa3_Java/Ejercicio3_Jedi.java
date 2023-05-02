package Informatorio.Etapa3_Java;

// Importamos la clase Scanner del paquete java.util para leer la entrada del usuario
import java.util.Scanner;

public class Ejercicio3_Jedi {
    public static void main(String[] args) {
        // Creamos una instancia de Scanner para leer la entrada del usuario
        Scanner inputScanner = new Scanner(System.in);
        
        // Pedimos al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        int num1 = inputScanner.nextInt();
        
        // Pedimos al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        int num2 = inputScanner.nextInt();
        
        // Calculamos la suma de los dos números ingresados
        int suma = num1 + num2;
        
        // Imprimimos la suma de los dos números ingresados
        System.out.println("La suma es de: " + suma);

        // Verificamos si los dos números ingresados son divisibles
        if(num1 % num2 == 0) {
            System.out.println("Los numeros ingresados son DIVISIBLES\n");
            // Si los números son divisibles, también imprimimos el resultado de la división
            System.out.println("El resultado de la division es: " + num1 / num2);
        } else {
            // Si los números no son divisibles, imprimimos un mensaje indicando eso
            System.out.println("Los numeros NO son DIVISIBLES...");
        }

        // Cerramos la instancia de Scanner para liberar recursos
        inputScanner.close();
    }
}
