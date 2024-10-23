import java.time.DayOfWeek;
import java.time.LocalDate;
public class Data {

    public static String getDiaDaSemana(DayOfWeek dia) {
        String diaDaSemanaStr = "";

        switch (dia) {
            case MONDAY:
                diaDaSemanaStr = "Segunda-feira";
                break;
            case TUESDAY:
                diaDaSemanaStr = "Terca-feira";
                break;
            case WEDNESDAY:
                diaDaSemanaStr = "Quarta-feira";
                break;
            case THURSDAY:
                diaDaSemanaStr = "Quinta-feira";
                break;
            case FRIDAY:
                diaDaSemanaStr = "Sexta-feira";
                break;
            case SATURDAY:
                diaDaSemanaStr = "Sabado";
                break;
            case SUNDAY:
                diaDaSemanaStr = "Domingo";
                break;
        }
        return diaDaSemanaStr;
    }

}
