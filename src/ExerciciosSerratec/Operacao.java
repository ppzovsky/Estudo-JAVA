package ExerciciosSerratec;

public class Operacao implements Opcao{

    private String tipo;
    private double valorOperacao;
    private Livro livro;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }


    public String getTipo() {
        return tipo;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    @Override
    public void emprestar() {
        tipo = "Emprestimo";
        valorOperacao = livro.getValor() * Opcao.taxaEmprestimo / 100;
    }

    @Override
    public void vender() {
        tipo = "Venda";
        valorOperacao = livro.getValor();
    }

    @Override
    public String toString() {
        return String.format("""
                Tipo: %s
                Valor: %s
                %s
                """, tipo, valorOperacao, livro);
    }

}
