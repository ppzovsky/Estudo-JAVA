package MainExercicios;
import ExerciciosSerratec.Gerente;
import ExerciciosSerratec.Vendedor;

import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "";
        double salario = 0.0;
        int opcao = 0;
        int qtdFuncionarios = 0;
        int mesesTrabalhados = 0;
        int totalVendas = 0;
        double percComissao = 0.0;

        while (opcao !=3 ){

            System.out.println("""
                Qual o tipo de funcionario voce quer cadastrar?
                1- Gerente
                2- Vendedor
                3- Sair
                """);

            opcao = leitura.nextInt();
            leitura.nextLine();
            if (opcao != 3){
                System.out.println("\nDigite um nome:");
                nome = leitura.nextLine();
                System.out.println("\nDigite o salario:");
                salario = leitura.nextDouble();
            }
            if (opcao == 1){
                Gerente gerente = new Gerente(nome, salario);
                System.out.println("Quantos funcionários ele tem no departamento?");
                qtdFuncionarios = leitura.nextInt();
                gerente.setQtdFuncionariosDepto(qtdFuncionarios);
                System.out.println("Quantos meses ele trabalhou no ano?");
                mesesTrabalhados = leitura.nextInt();
                gerente.setMesesTrabalhados(mesesTrabalhados);
                System.out.println(gerente);
            }
            if (opcao == 2){
                Vendedor vendedor = new Vendedor(nome, salario);
                System.out.println("Quantas vendas ele fez?");
                totalVendas = leitura.nextInt();
                vendedor.setTotalVendas(totalVendas);
                System.out.println("Qual sua comissão?");
                percComissao = leitura.nextDouble();
                vendedor.setPercComissao(percComissao);
                System.out.println(vendedor);
            }
            if (opcao>3){
                System.out.println("Digite uma opção válida");
            }
        }
        leitura.close();
    }
}
