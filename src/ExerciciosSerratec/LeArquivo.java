package ExerciciosSerratec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeArquivo {
    public static List<Livro> leLivros(String caminhoArquivo) throws FileNotFoundException {
        Scanner txt = new Scanner(new File("C:/Users/joaop/OneDrive/Área de Trabalho/JAVA/EstudosJava/listaLivros.txt"));
        List<Livro> livros = new ArrayList<>();

        while (txt.hasNextLine()) {
            String linha = txt.nextLine();
            String[] dados = linha.split("-");

            Livro livro = new Livro(dados[0], dados[1], Double.parseDouble(dados[2]));
            livros.add(livro);
        }

        return livros;
    }

}
