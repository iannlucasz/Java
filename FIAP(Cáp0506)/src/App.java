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
         pc.preco = 2.700;
         pc.processador = "Intel U300";

         // Class Fabricante.java

         Fabricante dell = new Fabricante();
         dell.nomeEmpresa = "Dell Tech";
         dell.localizacao = "Los Angeles (EUA)";
         
         pc.fabricante = dell;


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

        
       

         

    
    }
}
