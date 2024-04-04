package ExerciciosSerratec;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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

    public int tempoVenda(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataVenda, dataAtual);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();
        int diasTotais = (meses*30)+dias;
        return diasTotais;
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return super.toString() +
                String.format(
                """
                Data da Venda: %s
                Tempo de Venda: %s dias
                """ , df.format(dataVenda), tempoVenda());
    }
}
