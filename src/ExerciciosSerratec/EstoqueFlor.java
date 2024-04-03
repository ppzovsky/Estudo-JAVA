package ExerciciosSerratec;

import java.time.LocalDate;

public class EstoqueFlor extends Floricultura{

    private int quantidade;

    public EstoqueFlor(String flor, double preco, int quantidade) {
        super(flor, preco);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format("""
                Flor: %s
                Preco: %.2f
                Quantidade em estoque: %d
                """, this.getFlor(), this.getPreco(), quantidade);
    }
}
