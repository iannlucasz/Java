public class App {
    public static void main(String[] args) throws Exception {
     // Usando o boolean + condições
       
         boolean estaChovendo = false;
       boolean guardaChuva = true;

       if (estaChovendo == false && guardaChuva == true) {
            System.out.println("Nem ta chovendo malucão");
       } else if (estaChovendo == true && guardaChuva == true) {
            System.out.println("Você está preparado para a chuva né inteligente");
       } else {
        System.out.println("Tá se molhando pra deixar de ser bobo");
       }
        
        // Usando laços de repetição
        
         int contadorMin = 0;
        int contadorMax = 100;
        for(contadorMin = 0; contadorMin < contadorMax ; contadorMin+= 10){
          System.out.println(contadorMin);
        }
         
         // Usando operações matemáticas
         
           int numero1 = 5;
         int numero2 = 45;
         System.out.println(numero1 * numero2);
         System.out.println(numero1 + numero2);
         System.out.println(numero2 - numero1);
         System.out.println(numero2 / numero1);
          
    }
}
