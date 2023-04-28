import java.util.Arrays;

public class Arrays_Programacion1 {

    public static int calcularCuadrado(int numero){
        int cuadrado = numero * numero;
        return cuadrado;
    }


    public static int invertirArray(char elemento){

        return 0;
    }



    public static void main(String[] args){

        int[] arregloLargo = {20,20,20,20,20};
        int resultado = 0;
        for(int i=0; i<arregloLargo.length; i++){
            resultado = arregloLargo[i] + resultado;
        }
        System.out.println("Sumatoria de Valores: " + resultado);

        int promedio = 0;
        for(int i=0; i<arregloLargo.length; i++){
            promedio = arregloLargo[i] + promedio;
        }

        System.out.println("Promedio de valores: " + promedio/arregloLargo.length);

        String[] arregloSaludo = {"Hola","Como","Estas"};
        System.out.println(Arrays.toString(arregloSaludo));

    }




}

//public class EjemploFuncion {
//
//    // Declaración de la función que calcula el cuadrado de un número
//    public static int calcularCuadrado(int numero) {
//        int cuadrado = numero * numero;
//        return cuadrado;
//    }
//
//    // Función principal donde se llama a la función calcularCuadrado
//    public static void main(String[] args) {
//        int num = 5;
//        int resultado = calcularCuadrado(num);
//        System.out.println("El cuadrado de " + num + " es: " + resultado);
//    }
//}

