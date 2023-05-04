package Informatorio.Etapa3_Java;

import java.util.Scanner;

public class Ejercicio14_Jedi {
    public static void main (String[] args) {
        // Creamos el Scanner
        Scanner input = new Scanner(System.in);

        // Definimos las variables
        float Libras;
        float Dolares;
   
        // Solicitamos el ingreso del monto en Libras a convertir
        System.out.println("Ingrese el monto en Libras: ");
           Libras = input.nextFloat();
        // La conversion..
           Dolares = (float) (Libras * 1.4);
        // Mostramos la conversion..
        System.out.println("El valor de $" + Libras + " Libras en Dolares es de: $" + Dolares);
        // cerramos el input para sacar el warning...
        input.close();   
    }
}
