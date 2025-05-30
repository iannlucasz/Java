import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class App {
    public static void main(String[] args) throws Exception {
        // Pegando a data atual e mostrando no console


        LocalDate diaAtual = LocalDate.now();
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = diaAtual.format(formatoBrasileiro);
        System.out.println(dataFormatada);

        /*
         * System.out.println("O dia da semana (nome) é: " + diaAtual.getDayOfWeek().name());
        System.out.println("O dia da semana (ordinal) é: " + diaAtual.getDayOfWeek().ordinal());
        System.out.println("Mês (nome): " + diaAtual.getMonth().name());
        System.out.println("Mês (ordinal): " + diaAtual.getMonthValue());
        System.out.println("Ano: " + diaAtual.getYear());
        System.out.println("Ano bissexto: " + diaAtual.isLeapYear());
        System.out.println("Número de dias do mês: " + diaAtual.lengthOfMonth());
        System.out.println("Número de dias do ano: " + diaAtual.lengthOfYear());
         */

        


        // A partir de uma data nova , adicionar dias , meses ou anos á frente

        LocalDate ontem = diaAtual.minusDays(1);
        System.out.println("Ontem foi dia: " + ontem);


        LocalDate amanha = diaAtual.plusDays(1); // add dia
        System.out.println("Amanha será dia: " + amanha);
        LocalDate mesQueVem = diaAtual.plusMonths(1); // add mês
        System.out.println("Mês que vem será dia: " + mesQueVem);
        LocalDate anoQueVem = diaAtual.plusYears(1); // add ano
        System.out.println("Ano que vem será dia: " + anoQueVem);

        LocalDate ultimoDiaDoMes = diaAtual.with(TemporalAdjusters.lastDayOfMonth()); // verificar quando sera o ultimo dia do mês
        System.out.println("O ultimo dia do mês será: " + ultimoDiaDoMes);

        LocalDate ultimoDiaDeDezembro = diaAtual.withMonth(12).with(TemporalAdjusters.lastDayOfMonth()); // verificar o ultimo dia de dezembro
        System.out.println("O ultimo dia de dezembro será: " + ultimoDiaDeDezembro);



    }
}
