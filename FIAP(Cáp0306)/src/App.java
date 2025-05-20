import java.util.Scanner;

public class App {
    /*
     * implemente um programa que recebe o quantidade de laranjas que o cliente deseja comprar 
     * e se o pagamento será por PIX ou não ( boolean ). 
     * Caso a quantidade de laranjas seja MENOR do que 10, o valor de cada laranja será R$ 2,50.
     * Caso a quantidade de laranjas seja MAIOR ou IGUAL a 10 , o valor de será R$ 2,00.
     * Se o pagamentyo for por pix , será adicionado um desconto de 10%
     */
    public static void main(String[] args) throws Exception {
        
        Scanner contador = new Scanner(System.in);

        System.out.println("Qual sera á quantidade de laranjas que deseja comprar ?");
        int laranjas = contador.nextInt();

        System.out.println("Qual é sua forma de pagamento é via PIX ?");
        boolean pix = contador.nextBoolean(); // resposta com true e false

        double valor = laranjas < 10 ? 2.5 : 2;
        double desconto = pix == true ? .9 : 1;

        contador.close();

        double contaFinal = valor * laranjas * desconto;

        System.out.println("Sua conta no final foi de " + contaFinal);
    }
}
