package ClassesBiblioteca;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import static ClassesBiblioteca.LeArquivo.leLivros;
import  static ClassesBiblioteca.ProcuraLivro.buscarLivro;
public class    MenuBiblioteca {
    public static void menu() throws IOException {

        String caminhoArquivo = "C:/Users/joaop/OneDrive/Área de Trabalho/JAVA/Estudo-JAVA/listaLivros.txt";
        List<Livro> livros = leLivros(caminhoArquivo);
        Scanner op = new Scanner(System.in);

        System.out.println("""
                1- LIVROS DISPONÍVEIS
                2- COMPRAR UM LIVRO 
                3- PEGAR UM LIVRO EMPRESTADO
                4- ADICIONAR UM LIVRO
                5- VER UM LIVRO
                6- SAIR
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
                VendeLivro.venderLivro();
            case 3:
                EmprestaLivro.emprestarLivro();
            case 4:
            case 5:
                //Livro livroEncontrado = buscarLivro(livros);
                //System.out.println(livroEncontrado);
                System.out.println("Pressione 1 para voltar ao menu");
                opcao = op.nextInt();
                if (opcao == 1) {
                    menu();
                    break;
                }
            case 6:
                System.out.println("\nOBRIGADO POR LER COM A GENTE");
                break;

        }
        op.close();
    }
}
