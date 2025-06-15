public class Carro {
    String marca;
    String modelo;
    double ano;
    boolean cambioAutomatico;


    public Carro(String marca, String modelo, double ano, boolean cambioAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cambioAutomatico = cambioAutomatico;
    }

    @Override
    public String toString(){
        return "Marca do Carro: " + marca + "\n Modelo do carro: " + modelo + "\n Ano de lançamento: " + ano + "\n Cambio Automático: " + cambioAutomatico; 
    }


}
