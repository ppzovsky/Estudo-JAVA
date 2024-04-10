package ClassesBiblioteca;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LeArquivo {
    public static List<Livro> leLivros(String caminhoArquivo) throws IOException {
        BufferedReader txt = new BufferedReader(new FileReader("C:/Users/joaop/OneDrive/Área de Trabalho/JAVA/EstudosJava/listaLivros.txt"));
        List<Livro> livros = new ArrayList<>();

        String linha;
        while ((linha = txt.readLine()) != null) {
            // Processar cada linha
            String[] dados = linha.split("-");

            Livro livro = new Livro(dados[0], dados[1], Double.parseDouble(dados[2]));
            livros.add(livro);
        }

        return livros;
    }

}
