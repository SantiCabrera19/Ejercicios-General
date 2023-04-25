public class Arreglos_Java {
    public static void main(String[] args){
        int[] ventasemanal = new int[7];
        ventasemanal[0] = 1200;
        ventasemanal[1] = 251;
        int promedio = (ventasemanal[0] + ventasemanal[1]/2);

        System.out.println(promedio);

        for(int i = 0; i < ventasemanal.length; i++){
            System.out.println(ventasemanal[i]);
        }
    }
}
