package Exercícios;

public class Carro extends Veiculo{
    private int cilindrada;
    private boolean airbag;
    private String nome;

    @Override
    public String toString() {
        return "Carro{" +
                "nome=" + nome +
                ", marca=" + marca +
                ", tipo=" + tipo +
                ", ano=" + ano +
                ", cilindrada=" + cilindrada +
                ", airbag=" + airbag +
                '}';
    }

    public Carro(String tipo, int ano, String marca, int cilindrada) {
        super(tipo, ano, marca);
        this.cilindrada = cilindrada;
    }

    public static void main(String[] args) {

        Carro simples = new Carro ("Hatch", 98, "Ford", 87);

        simples.nome = "Escort";
        simples.airbag = true;

        System.out.println(simples);
    }
}
