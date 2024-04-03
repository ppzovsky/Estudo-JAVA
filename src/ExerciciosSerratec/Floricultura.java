package ExerciciosSerratec;

import java.time.LocalDate;

public class Floricultura {
    private String flor;
    private double preco;
    private LocalDate dataVenda;

    public Floricultura(String flor, double preco, LocalDate dataVenda) {
        this.flor = flor;
        this.preco = preco;
        this.dataVenda = dataVenda;
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
        return "Floricultura{" +
                "flor='" + flor + '\'' +
                ", preco=" + preco +
                ", dataVenda=" + dataVenda +
                '}';
    }
}
