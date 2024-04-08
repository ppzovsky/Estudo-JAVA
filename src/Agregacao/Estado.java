package Agregacao;

public class Estado {
    private String nome;
    private String sigla;

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return  nome + " | " + sigla;
    }
}
