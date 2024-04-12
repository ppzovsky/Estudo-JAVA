package ClassesBiblioteca;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static ClassesBiblioteca.LeArquivo.leLivros;

public class EditaArquivo {
    public static void editar(List <Livro> livros) throws IOException {
        String caminhoArquivo = "C:/Users/joaop/OneDrive/Área de Trabalho/JAVA/Estudo-JAVA/listaLivros.txt";
        //crio um arquivo para aremazenar a lista atualizada
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            // Escrever cada elemento da lista em uma linha separada
            for (Livro livro : livros) {
                escritor.write(livro.toString());
                escritor.newLine();
            }
        }
        //File original = new File(caminhoArquivo);
        //original.delete();
        //
        // listaAtualizada.renameTo(original);
    }
}
