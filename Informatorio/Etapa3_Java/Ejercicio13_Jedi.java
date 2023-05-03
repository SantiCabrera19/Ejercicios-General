package Informatorio.Etapa3_Java;

// importamos el Scanner
import java.util.Scanner;

public class Ejercicio13_Jedi {
    public static void main(String[] args) {
        // Creamos el Scanner
        Scanner input = new Scanner(System.in);

        // Definimos las variables
        int dolares;
        int pesos;

        // Solicitamos el ingreso del monto en dolares a convertir
        System.out.println("Ingrese el monto en dolares: ");
        dolares = input.nextInt();
        // La conversion..
        pesos = dolares * 20;
        // Mostramos la conversion..
        System.out.println("El valor de $" + dolares + " Dolares en Pesos es de: $" + pesos);
        // cerramos el input para sacar el warning...
        input.close();
    }
}
