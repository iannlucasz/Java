import javax.swing.JColorChooser;
// import javax.swing.JOptionPane;
import java.awt.Color;

public class App {
    public static void main(String[] args) throws Exception {

        // Código do Método Estático



        int numeroElevado = (int) Math.pow(2, 5);
        System.out.println(numeroElevado);

        // Criando objetos
        Casa c1 = new Casa("Iann Lucas");
        Casa c2 = new Casa("Thiaguinho 07");
        Casa c3 = new Casa("DropeZx");

        // Escolhendo cor
        Color novaCor = JColorChooser.showDialog(null, "Escolha uma cor para a casa", Casa.cor);
        if (novaCor != null) {
            Casa.cor = novaCor;
        }

        // Exibindo resultado
        System.out.println(c1.dono + " - " + Casa.cor);
        System.out.println(c2.dono + " - " + Casa.cor);
        System.out.println(c3.dono + " - " + Casa.cor);
    }
}

class Casa {
    String dono;
    static Color cor = Color.CYAN;

    public Casa(String dono) {
        this.dono = dono;
    }
}

