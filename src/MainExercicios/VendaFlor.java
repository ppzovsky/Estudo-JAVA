package MainExercicios;

import java.time.LocalDate;

import ExerciciosSerratec.EstoqueFlor;
import ExerciciosSerratec.Floricultura;
public class VendaFlor {
    public static void main(String[] args) {
        Floricultura venda = new Floricultura("Antulio", 45.9);
        venda.setDataVenda(LocalDate.of(2024,4,3));

        System.out.println(venda);

        EstoqueFlor planta = new EstoqueFlor("Samambaia",25.0, 25 );

        System.out.println(planta);
    }

}
