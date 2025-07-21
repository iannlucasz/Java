package animais;

public class Dragao extends Animal {

    public Dragao(String nome) {
        super(nome);
    }

    public void soltarFogo() {
        System.out.printf("%s soltou fogo\n", getNome());
    }

    public void voar() {
        System.out.printf("%s voou\n", getNome());
    }
    
}
