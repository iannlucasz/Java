import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * double dado6Faces = 1 + Math.random() * 2; // Método 1 - Usar o Math.random()
        System.out.println(dado6Faces);
        
        Random gerador = new Random(); // Método 2 - Usar o Random
        int numero = gerador.nextInt(100);
        System.out.println(numero);
         */

         Random geradorNumero = new Random();
         int numero = geradorNumero.nextInt(6) + 1;
         System.out.println(numero);
        
    }
}
