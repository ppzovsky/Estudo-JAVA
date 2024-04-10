package ClassesBiblioteca;
import java.util.List;
import java.util.Scanner;

public class ProcuraLivro {

    public static Livro buscarLivro(List<Livro> livros) {
        Scanner op = new Scanner(System.in);

        System.out.println("Qual livro voce deseja procurar? ");
        String nomeLivro = op.nextLine();

        Livro livroEncontrado = null;
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().contains(nomeLivro) || livro.getAutor().contains(nomeLivro)) {
                System.out.println("LIVRO ENCONTRADO" + livro);
                encontrado = true;
                livroEncontrado = livro;
            }
        }
        if (!encontrado) {
                System.out.println("LIVRO INDISPONIVEL \n");
        }
        return livroEncontrado;
    }
}
