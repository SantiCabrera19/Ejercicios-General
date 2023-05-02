package Informatorio.Etapa3_Java;
import java.util.Scanner;

public class Ejercicio2_Jedi{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        // Pedimos al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número: ");
        int num1 = inputScanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = inputScanner.nextInt();
        
        // Sumamos los dos números ingresados
        int suma = num1 + num2;
        
        // Verificamos si la suma es un número par o impar
        if(suma%2==0){
            System.out.println("El resultado es un numero PAR: " + suma);
        } else {
            System.out.println("El resultado es un numero IMPAR: " + suma);
        }

        inputScanner.close();
    }
}

   
