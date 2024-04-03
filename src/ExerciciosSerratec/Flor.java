package ExerciciosSerratec;

import java.time.LocalDate;

public class Flor {
    private String flor;
    private double preco;

    public Flor(String flor, double preco) {
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

    @Override
    public String toString() {
        return String.format("""
                Flor: %s
                Preco: %.2f
                """, flor, preco);
    }
}
