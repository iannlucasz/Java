import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDateTime horarioAgora = LocalDateTime.now();
        System.out.println(horarioAgora);

        ZonedDateTime horarioLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("O horário de Los Angeles agora é: " + horarioLosAngeles);

    }
    
}