import java.util.Scanner;
public class Ejercicio5Programacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número de un dígito: ");
        int a = input.nextInt();
        System.out.print("Ingrese el segundo número de un dígito: ");
        int b = input.nextInt();
        System.out.print("Ingrese el tercer número de un dígito: ");
        int c = input.nextInt();
        int x = a * 100 + b * 10 + c;
        System.out.println("Los números " + a + ", " + b + " y " + c + " concatenados son: " + x);
    }
}

