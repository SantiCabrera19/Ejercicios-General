package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de la clase Cuenta
        Cuenta cuenta = new Cuenta("Juan Pérez", 1000.0);

        // Mostramos el titular y la cantidad iniciales
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Cantidad: " + cuenta.getCantidad());

        // Realizamos operaciones en la cuenta
        cuenta.ingresar(1500.0);
        cuenta.retirar(200.0);

        // Mostramos el titular y la cantidad actualizados
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Cantidad: " + cuenta.getCantidad());
    }
}
