public class CalculadorArea {


    public double somarAreas(FigurasGeometricas quadrado, FigurasGeometricas circulo) {
        double totalArea = quadrado.calcularArea() + circulo.calcularArea();
        return totalArea;
    }
}
