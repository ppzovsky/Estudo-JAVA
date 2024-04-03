package MainExercicios;

import java.time.LocalDate;
import ExerciciosSerratec.Floricultura;
public class VendaFlor {
    public static void main(String[] args) {
        Floricultura venda = new Floricultura("Antulio", 45.9, LocalDate.of(2024,4,3));

        System.out.println(venda);

    }

}
