public class App {
    public static void main(String[] args) throws Exception {
        // Aprendendo sobre Classes

         // -----Abstração----- ( Está no "Computador.java")
         
         // -----Instanciação -----

         Computador pc = new Computador();

         // Class Computador.java

         pc.nomeComputador = "Samsung";
         pc.modelo = "Galaxy Book4";
         pc.memoriaRam = 8;
         pc.armazenamentoInterno = 256;
         pc.placaDeVideoIntegrada = true;
         pc.preco = 2700;
         pc.processador = "Intel U300";

         // Class Fabricante.java

         Fabricante dell = new Fabricante();
         dell.nomeEmpresa = "Dell Tech";
         dell.localizacao = "Los Angeles (EUA)";
         
         pc.fabricante = dell;

         double valorComDescontoPc = pc.calcularDesconto(0.1);
         System.out.println("Valor com desconto: " + valorComDescontoPc);

         boolean sucessoPc = pc.adicionarMemoriaRam(8);

         if (sucessoPc) {
            System.out.println("Produto: " + pc.modelo);
            System.out.println("Memória Ram adicionada");
            System.out.println("Quantidade de memória Ram: " + pc.memoriaRam);
            System.out.println("Novo valor do computador: " + pc.preco);
         } else {
            System.out.println("Produto: " + pc.modelo);
            System.out.println("Não foi possivel adicionar a memória");
         }

         
         Computador note = new Computador();

         // Class Computador.java

         note.nomeComputador = "Asus";
         note.modelo = "Vivobook";
         note.memoriaRam = 8;
         note.armazenamentoInterno = 512;
         note.placaDeVideoIntegrada = false;
         note.preco = 5000;
         note.processador = "Ryzen 5";

         // Class Fabricante.java

         Fabricante asus = new Fabricante();
         asus.nomeEmpresa = "Asus Tech";
         asus.localizacao = "Amazonas (Brasil)";

         note.fabricante = asus;

         double valorComDescontoNote = note.calcularDesconto(0.1);
         System.out.println("Valor com desconto: " + valorComDescontoNote);

         boolean sucessoNote = note.adicionarMemoriaRam(8);

         if (sucessoNote) {
            System.out.println("Produto: " + note.modelo);
            System.out.println("Memória Ram adicionada");
            System.out.println("Quantidade de memória Ram: " + note.memoriaRam);
            System.out.println("Novo valor do computador: " + note.preco);
         } else {
            System.out.println("Produto: " + pc.modelo);
            System.out.println("Não foi possivel adicionar a memória");
         }


          



         
         


        

         
    }
}
