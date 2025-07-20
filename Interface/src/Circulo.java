public class Circulo implements FigurasGeometricas {
    // Atributos
    private int raio;

    // Constructor
    public Circulo(int raio) {
        this.raio = raio;
    }

    

    // Métodos especificos da classe
    @Override
        public double calcularArea() {
          return Math.pow(raio, 2);
        }



    // Metodos getters e setters
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }



    
}
