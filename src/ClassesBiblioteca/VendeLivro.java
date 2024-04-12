package ClassesBiblioteca;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static ClassesBiblioteca.LeArquivo.leLivros;
import static ClassesBiblioteca.MenuBiblioteca.menu;
import static ClassesBiblioteca.ProcuraLivro.buscarLivro;
import static ClassesBiblioteca.EditaArquivo.editar;

public class VendeLivro {
    public static void venderLivro() throws IOException {
        String caminhoArquivo = "C:/Users/joaop/OneDrive/Área de Trabalho/JAVA/Estudo-JAVA/listaLivros.txt";
        List<Livro> livros = leLivros(caminhoArquivo);
        Scanner op = new Scanner(System.in);
        int opcao = 0;
        int livroEncontrado = buscarLivro(livros);

        if (livroEncontrado > 0 ) {
            System.out.println(String.format("""
                            1- CONFIRMAR COMPRA
                            2- BUSCAR OUTRO LIVRO
                            3- CANCELAR COMPRA
                            """));
            opcao = op.nextInt();
            switch (opcao){
                case 1:
                    Livro livroVenda = livros.get(livroEncontrado);
                    Operacao operacao = new Operacao();
                    operacao.setLivro(livroVenda);
                    operacao.vender(livroVenda);
                    livros.remove(livros.get(livroEncontrado));
                    System.out.println(livros);//removo o livro da lista
                    editar(livros);
                    System.out.println(operacao);
                    menu();
                    break;

                case 2:
                    venderLivro();
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
                    venderLivro();
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
        op.close();
    }
}
