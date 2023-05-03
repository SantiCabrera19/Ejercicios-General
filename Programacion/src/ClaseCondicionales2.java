import java.util.Scanner;

public class ClaseCondicionales2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la edad del primer Hermano: ");
        int edad_1er_hermano = input.nextInt();
        System.out.print("Ingrese la edad del segundo Hermano: ");
        int edad_2do_hermano = input.nextInt();
        int diferencia1 = edad_1er_hermano - edad_2do_hermano;
        int diferencia2 = edad_2do_hermano - edad_1er_hermano;

        if(edad_1er_hermano > edad_2do_hermano){
            System.out.println("El primer Hermano es Mayor");
            System.out.println("Y su diferencia de edad es de: " + diferencia1 + " Años");
        } else {
            System.out.println("El segundo Hermano es Mayor");
            System.out.println("Y su diferencia de edad es de: " + diferencia2 + " Años");
        }
        input.close();
    }
}
