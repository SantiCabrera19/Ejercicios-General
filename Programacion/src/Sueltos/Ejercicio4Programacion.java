import java.util.Scanner;

public class Ejercicio4Programacion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = input.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = input.nextDouble();
        double calculo1 = (num1 * 2) + (Math.pow(num2, 2));
        double promedio = ((Math.pow(num2, 3)) + (Math.pow(num2, 3))) / 2;
        System.out.println(calculo1);
        System.out.println(promedio);
        input.close();
    }
}
