import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2Programacion {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el Monto a Repartir: ");
        float monto = input.nextFloat();
        input.useLocale(Locale.US);

        double urgencias = monto * 0.37;
        double pediatria = monto * 0.42;
        double traumatologia = monto * 0.21;

        System.out.println("La cantidad que recibira Urgencias es: " + urgencias);
        System.out.println("La cantidad que recibira Pediatria es: " + pediatria);
        System.out.println("La cantidad que recibira Traumatologia es: " + traumatologia);
    }
}
