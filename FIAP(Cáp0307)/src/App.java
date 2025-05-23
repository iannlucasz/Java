import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner
        Scanner scanner = new Scanner(System.in); 


        // Tipo de reclamação
        System.out.println("Escolha seu tipo de Reclamação");
        System.out.println("1 - Produto não chegou (passou do prazo)");
        System.out.println("2 - Produto com defeito");
        System.out.println("3 - Garantia");
        System.out.println("4 - Localizar seu pedido");
        System.out.print("Opção: ");
        
        int opcao = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha


        // Uso do Switch Case
        switch(opcao) {
            case 1:
                System.out.print("Qual é o número do seu pedido? ");
                String numPedido = scanner.nextLine();

                if (numPedido.equals("34567823")) {
                    System.out.println("Seu pedido ainda está no prazo previsto! Aguarde.");
                } else {
                    System.out.println("O número do pedido está incorreto.");
                }
                break;

            case 2:
                System.out.println("Seu produto teve danos por conta da transportadora? (true/false)");
                boolean tipoDano = scanner.nextBoolean();

                if (tipoDano) {
                    System.out.println("Ligue para a transportadora com o número de protocolo: 4002-8922");
                } else {
                    System.out.println("Aparentemente seu produto não apresenta defeitos.");
                }
                break;

            case 3:
                System.out.println("Seu pedido ainda está na garantia? (true/false)");
                boolean garantiaTempo = scanner.nextBoolean();

                if (garantiaTempo) {
                    System.out.println("Ótimo, ligue para o número: 2305-2025");
                } else {
                    System.out.println("Infelizmente, não podemos solucionar seu problema sem garantia.");
                }
                break;

            case 4:
                System.out.print("Qual é o número do seu pedido? ");
                String numLoc = scanner.next();

                if (numLoc.equals("150956")) {
                    System.out.println("Seu pedido está a caminho!");
                    System.out.println("Última atualização: Processo de alfândega - Curitiba");
                } else {
                    System.out.println("Número do pedido incorreto.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close(); // fechamento do scanner

        
        
        
        
    }
}
