package Informatorio.Etapa3_Java;

// importamos el Scanner
import java.util.Scanner;

public class Ejercicio12_Jedi {
    public static void main(String[] args) {
        // Creamos el Scanner
        Scanner input = new Scanner(System.in);

        // Definimos las variables
        float dolares;
        double euros;
        // Solicitamos el ingreso del monto en dolares a convertir
        System.out.println("Ingrese el monto en dolares: ");
        dolares = input.nextFloat();
        // La conversion..
        euros = dolares*1.20;
        // Mostramos la conversion..
        System.out.println("El valor de $" + dolares + " Dolares en Euros es de: $" + euros);
        // cerramos el input para sacar el warning...
        input.close();
    }
}