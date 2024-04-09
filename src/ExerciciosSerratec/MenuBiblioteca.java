package ExerciciosSerratec;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import static ExerciciosSerratec.LeArquivo.leLivros;
public class MenuBiblioteca {
    public static void menu() throws FileNotFoundException {

        String caminhoArquivo = "C:/Users/joaop/OneDrive/Área de Trabalho/JAVA/EstudosJava/listaLivros.txt";
        List<Livro> livros = leLivros(caminhoArquivo);
        Scanner op = new Scanner(System.in);

        System.out.println("""
                1- LIVROS DISPONÍVEIS
                2- COMPRAR UM LIVRO 
                3- PEGAR UM LIVRO EMPRESTADO
                4- ADICIONAR UM LIVRO
                5- SAIR
                """);
        int opcao = op.nextInt();
        switch (opcao){
            case 1:
                for (Livro livro: livros){
                    System.out.println(livro);
                }
                System.out.println("Pressione 1 para voltar ao menu");
                opcao = op.nextInt();

                if (opcao == 1) {
                    menu();
                    break;
                }

            case 2:

            case 3:
            case 4:
            case 5:

        }while (opcao!=5);
    }
}
