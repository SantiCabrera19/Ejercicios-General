import java.util.Scanner;

public class Ejercicios1Programacion2 {

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int lista[] = cargarArreglo();
    }

    public static void cargarArreglo(int arreglo[]){
        Scanner cargar = new Scanner(System.in);
        int i;
        for(i = 0; i < 35; i++){
            arreglo[i] = cargar.nextInt();
        }
    }

}
