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

        public void setMarca(String string) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setMarca'");
        }

        public void exibirInfo() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'exibirInfo'");
        }

        public void setModelo(String string) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setModelo'");
        }

        public void setPreco(double d) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setPreco'");
        }

        public void setArmazenamento(int i) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setArmazenamento'");
        }

        public void verDados() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'verDados'");
        }

        
}
         

