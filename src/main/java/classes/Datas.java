package classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author thiagoabaguiar
 */

public class Datas {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(agora.format(formatadorHora));
        
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatadorData));
        
        LocalDate dataFutura = LocalDate.of(2039, Month.SEPTEMBER, 9);
        System.out.println(dataFutura);

        int dia = dataFutura.getDayOfMonth();
        int mes = dataFutura.getMonthValue();
        int ano = dataFutura.getYear();
        System.out.println(dia + "/" + mes + "/" + ano);
        
        Period periodo = Period.between(hoje, dataFutura);
        System.out.println(periodo.getYears());
        
        LocalTime horarioAlmoco = LocalTime.of(12,00);
        System.out.println(horarioAlmoco);
        
    }
}
