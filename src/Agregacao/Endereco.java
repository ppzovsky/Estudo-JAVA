package Agregacao;

public class Endereco{
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private Cidade cidade;

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public Endereco(String rua, int numero,String bairro, String cep, Cidade cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return  rua + ", " + numero + " | " + bairro + " - " +
                cep + " | " + cidade ;
    }
}
