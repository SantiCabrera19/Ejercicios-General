package Informatorio.Etapa3_Java;

import java.util.Scanner;

public class Ejercicio7_Jedi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre, apellido;
        int edad;

        System.out.print("Ingrese su Nombre: ");
        nombre = input.next();
        System.out.print("Ingrese su Apellido: ");
        apellido = input.next();
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();

        System.out.println("Usted es: " + nombre + " " + apellido + " y tiene: " + edad + " Años");

        input.close();
    }

}
