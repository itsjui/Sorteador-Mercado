import java.time.DayOfWeek;

public class Promoções {
    public static String getPromocao(DayOfWeek diaDaSemana, int departamento) {
        // A função desta classe é usada para obter a promoção de acordo o dia da semana e o departamento
        // Para chamarmos no método main para começarmos a operação

        String promocao = "";
        switch (departamento) {
            case 1:
                if (Data.getDiaDaSemana(diaDaSemana).equals("Segunda-feira")) {
                    promocao = "Promoção de comida! ";
                }
                break;
            case 2:
                if (Data.getDiaDaSemana(diaDaSemana).equals("Terça-feira")) {
                    promocao = "Promoção de bebidas! ";
                }
                break;
            case 3:
                if (Data.getDiaDaSemana(diaDaSemana).equals("Quarta-feira")) {
                    promocao = "Promoção de livros! ";
                }
                break;
            case 4:
                if (Data.getDiaDaSemana(diaDaSemana).equals("Quinta-feira")) {
                    promocao = "Promoção de roupas! ";
                }
                break;
            case 5:
                if (Data.getDiaDaSemana(diaDaSemana).equals("Sexta-feira")) {
                    promocao = "Promoção de tecnologia! ";
                }
                break;
            case 6:
                if (Data.getDiaDaSemana(diaDaSemana).equals("Sabado")) {
                    promocao = "Promoção de saúde! ";
                }
                break;
        }
        return promocao;
    }
}







