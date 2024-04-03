package MainExercicios;
import ExerciciosSerratec.Pessoa;
public class TestaPessoa extends Pessoa {
    public TestaPessoa(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }

    public static String TestaIMC(double imc){

        if (imc < 18.5){
            return"\nABAIXO DO PESO";
        }
        if (imc > 18.5 && imc<=24.9){
            return"\nPESO IDEAL";
        }
        if (imc > 25 && imc<=29.9) {
            return"\nSOBREPESO";
        }
        if (imc > 30 && imc<=34.9) {
           return"\nOBESIDADE GRAU I";
        }
        if (imc > 35 && imc<=39.9) {
            return"\nOBESIDADE GRAU II";
        }
        if (imc>=40){
            return"\nOBESIDADE GRAU III";
        }
        return "";
    }

    public static void main(String[] args) {

        Pessoa jovem = new Pessoa("Junin", "Nao-Binarie", 25);

        jovem.setAltura(1.85);
        jovem.setPeso(70);
        System.out.println(jovem);
        double imc = jovem.calcula_imc();

        System.out.println(TestaIMC(imc));

    }
}
