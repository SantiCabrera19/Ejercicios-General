import java.util.Scanner;

public class EjerciciosProgramacion2 {

    public static void main (String args[]){
        // Variables
        int num, resultado;
        // Scanner
        Scanner input = new Scanner(System.in);

        num = input.nextInt();

        if(num <= 0){
            System.out.println("Ingrese un numero valido!");
        } else {
            resultado = numeroCifras(num);
            System.out.println("el numero tiene " + resultado + "cifras");
        }
    }

    private static int numeroCifras(int numero){
        return numero
    }

}
