import java.util.Scanner;

public class Main {
    // creo un scanner
    Scanner input = new Scanner(System.in);

    // main para ejecutar
    public static void main(String[] args) {

        // Usamos el objeto, cuenta1 para el primer sujeto
        Cuenta cuenta1 = new Cuenta("Santiago", 10000);
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Monto: " + cuenta1.getCantidad());

        // cuenta2 para el segundo, con esta sintaxis se usan las clases :D
        Cuenta cuenta2 = new Cuenta("Virginia", 12000);
        System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Monto: " + cuenta2.getCantidad());


        // Realizar operaciones en las cuentas con los metodos que creamos

        // a la cuenta 1
        cuenta1.depositar(500.0);
        cuenta1.retirar(200.0);

        // a la cuenta 2
        cuenta2.depositar(1500.0);
        cuenta2.retirar(300.0);

        System.out.println("Montos luego de los depositos y retiros: ");
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Monto: " + cuenta1.getCantidad());
        System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Monto: " + cuenta2.getCantidad());

    }
}