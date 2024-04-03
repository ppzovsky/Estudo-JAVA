package ExerciciosSerratec;

import java.time.LocalDate;

public class Floricultura {
    private String flor;
    private double preco;
    private LocalDate dataVenda;

    public Floricultura(String flor, double preco) {
        this.flor = flor;
        this.preco = preco;
    }

    public String getFlor() {
        return flor;
    }

    public void setFlor(String flor) {
        this.flor = flor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public String toString() {
        return String.format("""
                Flor: %s
                Preco: %.2f
                Data da Venda: %s
                """, flor, preco, dataVenda);
    }
}
