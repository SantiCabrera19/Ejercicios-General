import java.util.Scanner;

public class Clase3Programacion {
    // body main
    public static void main(String args[]) {
        // scanner
        Scanner input = new Scanner(System.in);

        // usamos nuestros objetos
        empleado empleado1 = new empleado("Santiago", "Pje Fortin Aguilar", 20, 44504174);
        empleado empleado2 = new empleado("Emanuel", "Fortin Aguilar", 40, 44604164);

        // usamos los metodos creados
        System.out.println("Información del empleado 1:");
        System.out.println("Nombre: " + empleado1.obtenerNombre());
        System.out.println("Dirección: " + empleado1.obtenerDireccion());
        System.out.println("Edad: " + empleado1.obtenerEdad());
        System.out.println("DNI: " + empleado1.obtenerDNI());

        System.out.println("\nInformación del empleado 2:");
        System.out.println("Nombre: " + empleado2.obtenerNombre());
        System.out.println("Dirección: " + empleado2.obtenerDireccion());
        System.out.println("Edad: " + empleado2.obtenerEdad());
        System.out.println("DNI: " + empleado2.obtenerDNI());

    }
}

