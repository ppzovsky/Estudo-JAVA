package MainExercicios;

import Exercícios.Veiculo;

public class Carro extends Veiculo {
    public int cilindrada;
    public boolean airbag;
    public String nome;
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro(String tipo, int ano, String marca, int cilindrada) {
        super(tipo, ano, marca);
        this.cilindrada = cilindrada;
    }

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



    public static void main(String[] args) {

        Carro simples = new Carro ("Hatch", 98, "Ford", 87);

        simples.nome = "Escort";
        simples.airbag = true;

        System.out.println(simples);
    }
}
