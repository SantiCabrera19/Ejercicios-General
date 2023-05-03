import java.util.Scanner;

public class Ejercicio3Programacion {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double hora_base = 150;
        System.out.print("Ingrese las horas trabajadas: ");
        double horas_trabajadas = input.nextDouble();
        System.out.print("¿Trabaja horas extras? (si/no): ");
        String horas_extras = input.next();
        double horas_extras_trabajadas;

        if (horas_extras.equals("si")){
            System.out.print("Ingrese las horas extra: ");
            horas_extras_trabajadas = input.nextDouble();
            horas_extras_trabajadas = (horas_extras_trabajadas * hora_base) * 2;
            double salario = hora_base * horas_trabajadas + horas_extras_trabajadas;
            System.out.println("Tu salario es: " + salario);
        } else {
            double salario = hora_base * horas_trabajadas;
            System.out.println("Tu salario es: " + salario);
        }
        input.close();
    }
}
