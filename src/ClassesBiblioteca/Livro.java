package ClassesBiblioteca;

public class Livro{
    private String autor;
    private String titulo;
    private double valor;


    public Livro(String titulo, String autor, double valor) {
        this.titulo = titulo;
        this.autor = autor;
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
        this.valor += valor;
    }
    @Override
    public String toString() {
        return String.format("""
                Titulo: %s
                Autor: %s
                Valor: R$%.2f
                """, titulo, autor, valor);
    }


}
