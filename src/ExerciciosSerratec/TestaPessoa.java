package ExerciciosSerratec;

public class TestaPessoa extends Pessoa {
    public TestaPessoa(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }

    public static void main(String[] args) {

        Pessoa jovem = new Pessoa("Junin", "Nao-Binarie", 25);

        jovem.setAltura(1.85);
        jovem.setPeso(70);
        System.out.println(jovem);

    }
}
