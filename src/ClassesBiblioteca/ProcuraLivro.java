package ClassesBiblioteca;
import java.util.List;
import java.util.Scanner;

public class ProcuraLivro {

    public static int buscarLivro(List<Livro> livros) {
        Scanner op = new Scanner(System.in);

        System.out.println("Qual livro voce deseja procurar? ");
        String nomeLivro = op.nextLine();

        int livroEncontrado = -1;
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().contains(nomeLivro) || livro.getAutor().contains(nomeLivro)) {
                System.out.println("LIVRO ENCONTRADO\n" + livro);
                encontrado = true;
            }
            livroEncontrado++;
        }
        if (!encontrado) {
                System.out.println("LIVRO INDISPONIVEL \n");
                livroEncontrado = -1;
        }
        return livroEncontrado;
    }
}
