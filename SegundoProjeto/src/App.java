

public class App {
    public static void main(String[] args) throws Exception {
        String filme = "Interestelar"; // %s
        int lancamento = 2014; // %d
        int duracao = 169;
        float notaCritica = 8.7f; // %f
        boolean foiSucesso = true;

        System.out.println("O filme " + filme + " foi lançado no ano de " + lancamento + " com uma duração de " + duracao + " minutos. Sua nota critica foi de " + notaCritica + " no IMDB, e no final foi um sucesso? acho que " + foiSucesso ); // 1º jeito de imprimir

        System.out.format("O filme %s foi lançado no ano de %d , com uma duração de %d minutos. Sua nota crítica foi de %.1f no IMDB" , filme , lancamento , duracao , notaCritica); // 2º jeito de imprimir

       

    }
}
