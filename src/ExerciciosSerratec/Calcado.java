package ExerciciosSerratec;

public class Calcado {
    public String tipo;
    public String modelo;
    public String cor;
    public String estilo;
    public int tamanho;
    public Double valor;

    public Calcado(String tipo, int tamanho, Double valor) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Calcado{\n" +
                "tipo='" + tipo +
                "\nmodelo=" + modelo +
                "\ncor=" + cor +
                "\nestilo=" + estilo +
                "\ntamanho=" + tamanho +
                "\nvalor=" + valor +
                '}';
    }
}
