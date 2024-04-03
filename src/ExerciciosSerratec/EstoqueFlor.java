package ExerciciosSerratec;

public class EstoqueFlor extends Flor {

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
        return super.toString() + String.format(
                """
                Quantidade em estoque: %d
                """, quantidade);
    }
}
