import java.util.Scanner;

public class EjericiosProgramacion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float precio_base = 45;
        float precio_final;
        System.out.print("Ingrese el numero de kilometros: ");
        float kilometros = input.nextFloat();
        precio_final = precio_base * kilometros;
        System.out.println(precio_final);
        input.close();
    }
}
