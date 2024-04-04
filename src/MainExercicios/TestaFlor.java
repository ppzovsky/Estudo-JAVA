package MainExercicios;

import java.time.LocalDate;

import ExerciciosSerratec.EstoqueFlor;
import ExerciciosSerratec.VendaFlor;
import ExerciciosSerratec.Flor;
public class TestaFlor {
    public static void main(String[] args) {
        VendaFlor venda = new VendaFlor("Antulio", 45.9);
        venda.setDataVenda(LocalDate.of(2024,1,31));

        System.out.println(venda);
        //System.out.println("\nVendida a %d dias", tempoVenda(venda.getDataVenda()));

        EstoqueFlor planta = new EstoqueFlor("Samambaia",25.0, 25 );

        System.out.println(planta);
    }

}
