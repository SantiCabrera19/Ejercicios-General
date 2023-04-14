import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int num = input.nextInt();

        if (num < 5) {
            System.out.println("El número es menor que 5");
        } else if (num == 5) {
            System.out.println("El número es igual a 5");
        } else {
            System.out.println("El número es mayor que 5");
        }

    }
}