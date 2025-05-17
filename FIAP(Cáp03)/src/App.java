        // Prova semestral que compõe 50% na média
        // Trabalho de conclusão de curso que possui 30%
        /* As avaliações intermediárias que são compostos por duas avaliações durante a semestre e a média dessas 
        avaliações contribuem em 20% para a média final */

        // Portanto a média final é composta pela seguinte fórmula : double mediaFinal = ps * 0.5 + tcc * 0.3 + ((av1 + av2)/2)*0.2;

        // Vamos supor que um aluno tirou 7 na prova semestral , 5 no trabalho de conclusão, 10 e 6 na média nas avaliações intermediárias , qual será sua média final ?

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner avaliar = new Scanner(System.in);

        System.out.println("Qual foi sua nota na prova semestral ?");
        float ps = avaliar.nextFloat();

        System.out.println("Qual foi sua nota final no TCC ?");
        float tcc = avaliar.nextFloat();

        System.out.println("Qual foi sua nota na 1º atividade intermediárias ?");
        float av1 = avaliar.nextFloat();

        System.out.println("Qual foi sua nota na 2º atividade intermediárias");
        float av2 = avaliar.nextFloat();

        avaliar.close();

        double mediaFinal = ps * 0.5 + tcc * 0.3 + ((av1 + av2)/2)*0.2;

        if(mediaFinal >= 6){
            System.out.println("APROVADO COM NOTA MAX");
        } else if (mediaFinal == 5) {
            System.out.println("APROVADO NA MEDIA");
        } else {
            System.out.println("REPROVADO");
        }

        System.out.println("Sua nota final foi de " + mediaFinal);

    }
}
