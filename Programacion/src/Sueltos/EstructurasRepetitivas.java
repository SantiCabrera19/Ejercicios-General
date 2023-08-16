public class EstructurasRepetitivas {
    public static void main(String[] args){

        for(int i = 2; i <= 300; i+=2){
            System.out.print(i+", ");
        }
        int cont = 0;

        while (cont < 300){
            if (cont==302) break;
            System.out.println(cont);
            cont += 2;

        }
    }
}
