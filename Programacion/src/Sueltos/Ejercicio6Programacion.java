import java.util.Scanner;

public class Ejercicio6Programacion {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numero de alumnos totales: ");
        double alumnos_totales = input.nextDouble();
        System.out.print("Ingrese el numero de alumnos varones: ");
        double alumnos_v = input.nextDouble();
        System.out.print("Ingrese el numero de alumnas mujeres: ");
        double alumnos_m = input.nextDouble();
        double promedio_alumnos_v = (alumnos_v / alumnos_totales)*100;
        double promedio_alumnos_m = (alumnos_m / alumnos_totales)*100;
        System.out.println("El porcentaje de alumnos varones es de %" + promedio_alumnos_v);
        System.out.println("El porcentaje de alumnas mujeres es de %" + promedio_alumnos_m);
        input.close();

    }
}
