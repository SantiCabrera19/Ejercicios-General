import java.util.Scanner;

public class Main {
    // creo un scanner
    Scanner input = new Scanner(System.in);

    // main para ejecutar
    public static void main(String[] args) {
        // Crear objetos Libro con la clase Libro que ya creamos
        Libro libro1 = new Libro("1234567890", "One Piece", "Eiichiro Oda", 442);
        Libro libro2 = new Libro("9876543210", "Harry Potter", "JKRowlling", 231);

        // Mostrar información de los libros usando le ToString que se solicito
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        // Determinar cuál libro tiene más páginas
        if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
            //libro1.getNumeroPaginas() --> devuelve el numero de paginas(double)
            System.out.println("El libro 1 tiene más páginas.");
        } else if (libro2.getNumeroPaginas() > libro1.getNumeroPaginas()) {
            System.out.println("El libro 2 tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }
    }
}