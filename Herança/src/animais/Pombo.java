package animais;

public class Pombo extends Animal {

    public Pombo(String nome) {
        super(nome);
        
    }

    public void voar() {
        System.out.printf("%s voou\n", getNome());
    }

    public void fazerPruh() {
        System.out.printf("%s fez Pruh\n", getNome());
    }

    
}
