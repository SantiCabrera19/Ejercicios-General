import java.util.Scanner;
public class SwitchProgramacion {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 7 ");
        int dia = input.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
            break;
            case 2:
                System.out.println("Martes");
            break;
            case 3:
                System.out.println("Miercoles");
            break;
            case 4:
                System.out.println("Jueves");
            break;
            case 5:
                System.out.println("Viernes");
            break;
            case 6:
                System.out.println("Sabado");
            break;
            case 7:
                System.out.println("Domingo");
            break;
            default:
                System.out.println("Numero fuera de RANGO");
        }
        input.close();
    }
}
