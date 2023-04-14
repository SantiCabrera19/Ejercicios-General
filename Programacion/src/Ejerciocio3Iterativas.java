import java.util.Scanner;

public class Ejerciocio3Iterativas {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int total, num1, opcion, acum, pro;
        total = 0;
        num1 = 0;
        opcion = 0;
        acum = 0;
        pro = 0;

        do{
            System.out.print("Ingrese un numero del 0 al 300: ");
            num1 = input.nextInt();
            if(num1 > 300 || num1 < 0){
                System.out.print("Valor Ingresado Invalido!"); break;
            } else {
                acum += 1;
                total = num1 + total;
                pro = total / acum;
            }
            System.out.println("Desea agregar otro numero? 1 = si y 2 = no");
            opcion = input.nextInt();

        }
        while(opcion == 1);
        System.out.println("el total de los numeros ingresados es: " + total);
        System.out.println("Y su promedio es de: " + pro);
    }

}
