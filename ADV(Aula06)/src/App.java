
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*
       String filme = JOptionPane.showInputDialog(null , "Qual é o seu filme favorito da sua vida?" , "iannzin30" , JOptionPane.QUESTION_MESSAGE);
        System.out.println(filme);

        */ 

       String dados;
       System.out.println("Qual é o seu CPF ?");
       Scanner leitorDados = new Scanner(System.in);
       leitorDados.useDelimiter("[\r\n]+");

       dados = leitorDados.next();
       System.out.println("O seu CPF é: " + dados + " cuidado para ninguem saber rsrs");

       leitorDados.close();


/*
 * String jogo;
       System.out.println("Qual é o seu jogo do momento ?");
       Scanner leitor = new Scanner(System.in);
       leitor.useDelimiter("[\r\n]+");



       jogo = leitor.next();
       System.out.println("O jogo do momento é  " + jogo);

       leitor.close(); // fecha o Scanner
 */
       


        
    }
}

