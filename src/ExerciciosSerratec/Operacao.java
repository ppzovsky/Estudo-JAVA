package ExerciciosSerratec;

public class Operacao implements Opcao{

    private String tipo;
    private double valorOperacao;
    private Livro livro;

    public Operacao(String tipo, double valorOperacao, Livro livro) {
        super();
        this.tipo = tipo;
        this.valorOperacao = valorOperacao;
        this.livro = livro;
    }

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

    public void venderLivro() {}

    public void emprestarLivro() {}


    @Override
    public void emprestar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void vender() {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return "Operacao [tipo=" + tipo + ", valorOperacao=" + valorOperacao + ", livro=" + livro + "]";
    }

}
