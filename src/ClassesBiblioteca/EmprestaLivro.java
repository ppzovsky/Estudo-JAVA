package ClassesBiblioteca;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static ClassesBiblioteca.LeArquivo.leLivros;
import static ClassesBiblioteca.MenuBiblioteca.menu;
import static ClassesBiblioteca.ProcuraLivro.buscarLivro;

public class EmprestaLivro{
    public static void emprestarLivro() throws IOException {
        String caminhoArquivo = "C:/Users/joaop/OneDrive/Área de Trabalho/JAVA/EstudosJava/listaLivros.txt";
        List<Livro> livros = leLivros(caminhoArquivo);
        Scanner op = new Scanner(System.in);
        int opcao = 0;
        Livro livroEncontrado = buscarLivro(livros);
        System.out.println(livroEncontrado);

        if (livroEncontrado != null) {
            System.out.println(String.format("""
                            1- CONFIRMAR COMPRA
                            2- BUSCAR OUTRO LIVRO
                            3- CANCELAR COMPRA
                            """));
            opcao = op.nextInt();
            switch (opcao){
                case 1:
                    Operacao operacao = new Operacao();
                    operacao.setLivro(livroEncontrado);
                    operacao.vender(livroEncontrado);
                    System.out.println(operacao);
                    menu();
                    break;

                case 2:
                    emprestarLivro();
                    System.out.println("Pressione 1 para voltar ao menu");
                    opcao = op.nextInt();

                    if (opcao == 1) {
                        menu();
                        break;
                    }

                case 3:
                    menu();
                    break;
            }
        }
        else {
            System.out.println(String.format("""
                            1- BUSCAR OUTRO LIVRO
                            2- CANCELAR COMPRA
                            """));
            opcao = op.nextInt();

            switch (opcao){
                case 1:
                    emprestarLivro();
                    System.out.println("Pressione 1 para voltar ao menu");
                    opcao = op.nextInt();

                    if (opcao == 1) {
                        menu();
                        break;
                    }
                case 2:
                    menu();
                    break;
            }
        }
    }
}

