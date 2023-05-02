package Informatorio.Etapa3_Java;
import java.util.Scanner;

public class Ejercicio1_Jedi {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = inputScanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = inputScanner.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma es: " + suma);

        inputScanner.close();
    }
}
