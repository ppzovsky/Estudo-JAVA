package ExerciciosSerratec;

public class Pessoa {
    private String nome;
    private String genero;
    private double altura;
    private double peso;
    private int idade;

    public double calcula_imc(){
        return peso/(altura*altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\t\tGenero: %s\t\tIdade: %d\nAltura: %.2f\t\tPeso: %.2f\t\tIMC: %.2f", nome, genero, idade, altura, peso, calcula_imc());
    }
}
