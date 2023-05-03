package Informatorio.Etapa3_Java;

public class Ejercicio11_Jedi {
    public static void main(String[] args) {
        // Definimos las variables de la edad
        int edad1 = 21;
        int edad2 = 22;
        int edad3 = 23;
        // Calculamos el promedio de edad
        int promedio = (edad1 + edad2 + edad3)/3;

        // Definimos las variables de los nombres
        String nombre1 = "Santiago";   
        String nombre2 = "Jorge";  
        String nombre3 = "Jay";   

        // Mostramos por pantalla nuestros calculos
        System.out.println("Nombre: " + nombre1 + "| edad: " + edad1);
        System.out.println("Nombre: " + nombre2 + "| edad: " + edad2);
        System.out.println("Nombre: " + nombre3 + "| edad: " + edad3);
        System.out.println("Promedio de edad: " + promedio);
    }
}
