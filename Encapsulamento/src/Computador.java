public class Computador {
    // Fazendo os atributos usando o Private

    private String marca;
    private String modelo;
    private double preco;
    private int armazenamento;

    // Usando Getter e Setter da Marca
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Marca Inválida.");
        }
    }

    // Usando Getter e Setter do modelo
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        if(modelo != null && !modelo.isEmpty()){
            this.modelo = modelo;
        } else {
            System.out.println("Modelo Inválido");
        }
    }

    // Usando Getter e Setter do preco
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }

    }

    // Usando Getter e Setter do Armazenamento 
    public int getArmazenamento(){
        return armazenamento;
    }
    public void setArmazenamento(int armazenamento) {
        if (armazenamento >= 0) {
            this.armazenamento = armazenamento;
        } else {
            System.out.println("Valor de armazenamento inválido!");
        }
    }



    // Método para exbir as informações 
    public void verDados(){
        System.out.println("------ Informações do Computador ------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Armazenamento: " + getArmazenamento() + "GB");
        System.out.println("----------------------------------------");
    }

    


}