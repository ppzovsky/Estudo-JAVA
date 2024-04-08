package ExerciciosSerratec;

public class Livro{
    private String autor;
    private String titulo;
    private double valor;


    public Livro(String autor, String titulo, double valor) {
        super();
        this.autor = autor;
        this.titulo = titulo;
        this.valor = valor;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public double getValor() {
        return valor;
    }

    public void reajuste(double valor) {

    }
    @Override
    public String toString() {
        return "Autor: " + autor + "\nTitulo: " + titulo + "\nValor: " + valor;
    }


}
