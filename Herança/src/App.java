import animais.Cachorro;
import animais.Dragao;
import animais.Gato;
import animais.Pombo;

public class App {
    public static void main(String[] args) throws Exception {

        // Cachorro
        Cachorro cachorro = new Cachorro("Pipoca");
        cachorro.comer();
        cachorro.latir();

        // Gato
        Gato gato = new Gato("Miura");
        gato.miar();

        // Dragao
        Dragao dragao = new Dragao("Banguela");
        dragao.voar();
        dragao.soltarFogo();

        // Pombo
        Pombo pombo = new Pombo("Pombozin");
        pombo.voar();
        pombo.fazerPruh();


    }
}
