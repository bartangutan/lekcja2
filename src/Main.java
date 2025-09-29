import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //10 liczb z zakresu 1-20
        Random random = new Random();
        int[] losoweLiczby = new int[10];
        for(int i=0; i<losoweLiczby.length; i++){
            losoweLiczby[i]= random.nextInt(20)+1;
        }

        System.out.println("Wszystkie liczby wylosowane: ");
        for (int elementTablicy:losoweLiczby) {
            System.out.println(elementTablicy+", ");
        }
        //System.out.println();
    }

}