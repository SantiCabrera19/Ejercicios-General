public class Matrices_Java{
    public static void main(String[] args) {
        //crear una matriz de 3x3
        int[][] miMatriz = new int[3][3]; //crea una matriz de enteros de 3x3

        //establecer algunos valores en la matriz
        miMatriz[0][0] = 1; //asigna el valor 1 a la celda (0,0)
        miMatriz[0][1] = 2; //asigna el valor 2 a la celda (0,1)
        miMatriz[0][2] = 3; //asigna el valor 3 a la celda (0,2)
        miMatriz[1][0] = 4; //asigna el valor 4 a la celda (1,0)
        miMatriz[1][1] = 5; //asigna el valor 5 a la celda (1,1)
        miMatriz[1][2] = 6; //asigna el valor 6 a la celda (1,2)
        miMatriz[2][0] = 7; //asigna el valor 7 a la celda (2,0)
        miMatriz[2][1] = 8; //asigna el valor 8 a la celda (2,1)
        miMatriz[2][2] = 9; //asigna el valor 9 a la celda (2,2)

        //mostrar los valores de la matriz en la consola
        for (int i = 0; i < miMatriz.length; i++) { //itera a través de las filas de la matriz
            for (int j = 0; j < miMatriz[i].length; j++) { //itera a través de las columnas de la matriz
                System.out.print(miMatriz[i][j] + " "); //imprime el valor actual de la celda
            }
            System.out.println(); //muestra una nueva línea después de cada fila
        }
    }
}
