import java.util.Scanner;

public class ClaseCondicionales {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Dime el precio total: ");
        double precio = input.nextDouble();
        double total_pagar;
        if (precio >= 1000){
            total_pagar = precio - (precio * 0.20);
            System.out.print("Tiene un descuento y el total a pagar es de : " + total_pagar);
        } else {
            total_pagar = precio;
            System.out.println("El total a pagar es de :" + total_pagar);
        }

    }
}
