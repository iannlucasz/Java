public class Computador {
    

        String nomeComputador;
        String modelo;
        int memoriaRam;
        int armazenamentoInterno;
        double preco;
        String processador;
        boolean placaDeVideoIntegrada;

        

        Fabricante fabricante;

        public double calcularDesconto(double desconto) {
                return preco * desconto;
        }

        boolean adicionarMemoriaRam(int quantidade) {
                if (quantidade % 2 == 1) return false;
                memoriaRam += quantidade;
                preco += quantidade * 150;
                return true;
        }

        
}
         

