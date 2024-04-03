package ExerciciosSerratec;

import java.time.LocalDate;

public class VendaFlor extends Flor {
    public VendaFlor(String flor, double preco) {
        super(flor, preco);
    }
    private LocalDate dataVenda;
    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                """
                Data da Venda: %s
                """ , dataVenda);
    }
}
