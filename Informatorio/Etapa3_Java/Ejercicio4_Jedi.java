package Informatorio.Etapa3_Java;

public class Ejercicio4_Jedi {
    public static void main(String[] args) {
        int base = 5; // Declaración de la variable 'base' que indica el número de líneas que tendrá el triángulo

        for(int i = 0; i < base; i++) { // Bucle externo que controla el número de líneas que se imprimirán
            for(int j = 0; j <= i; j++) { // Bucle interno que controla el número de asteriscos que se imprimirán en cada línea
                System.out.print("* "); // Imprime un asterisco y un espacio en blanco
            }
            System.out.println(); // Salta a la siguiente línea
        }
    }
}

