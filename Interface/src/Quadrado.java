public class Quadrado implements FigurasGeometricas {
    // Atributo 
    private int lado;

    // Construtor
    public Quadrado (int lado) {
        this.lado = lado;
    }

    // Método Especifico
    @Override
    public double calcularArea() {
        return Math.pow(lado , 2);
    }

    // Método Getters and Setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }



    
    

   

}
