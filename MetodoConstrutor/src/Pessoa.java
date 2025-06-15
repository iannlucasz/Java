public class Pessoa {
    String nome;
    String dataNascimento;
    int idade;

    // Método Construtor

    public Pessoa (String nome, String dataNascimento , int idade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    // Usando o método toString paa formatar o sysout

    @Override
    public String toString() {
        return "👤 Nome: " + nome + "\n📆 Nascimento: " + dataNascimento + "\n🎂 Idade: " + idade + " anos";
    }
}

