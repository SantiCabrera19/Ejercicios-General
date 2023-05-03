import java.util.Scanner;

public class RecorrerArreglos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ventasemanal = new int[5];

        for (int i = 0; i < ventasemanal.length; i++) {
            System.out.print("Ingrese las ventas del día " + obtenerDia(i) + ": ");
            ventasemanal[i] = input.nextInt();
        }

        for (int i = 0; i < ventasemanal.length; i++) {
            System.out.println("Ventas del dia " + obtenerDia(i) + ": " + ventasemanal[i]);
        }
        input.close();
    }

    public static String obtenerDia(int dia) {
        String diasemana;

        switch (dia) {
            case 0:
                diasemana = "Lunes";
                break;
            case 1:
                diasemana = "Martes";
                break;
            case 2:
                diasemana = "Miércoles";
                break;
            case 3:
                diasemana = "Jueves";
                break;
            case 4:
                diasemana = "Viernes";
                break;
            case 5:
                diasemana = "Sábado";
                break;
            default:
                diasemana = "Día invalido";
                break;
        }

        return diasemana;
        
    }
}



