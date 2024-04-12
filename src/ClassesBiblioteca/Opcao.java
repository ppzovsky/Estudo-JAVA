package ClassesBiblioteca;

public interface Opcao {
    double taxaEmprestimo = 2.8;

    void emprestar(Livro livroVenda);

   void vender(Livro livroVenda);
}
