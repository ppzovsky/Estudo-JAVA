package MainExercicios;

import Agregacao.Cidade;
import Agregacao.Contato;
import Agregacao.Endereco;
import Agregacao.Estado;
import Agregacao.Telefone;

import java.util.ArrayList;
import java.util.List;

public class TestaContato {
    public static void main(String[] args) {
        Contato novoContato = new Contato("Penispen",
                new Endereco("Estrada do Palmital", 778, "Nogueira", "25730-500",
                        new Cidade("Petropolis",
                                new Estado("Rio de Janeiro", "RJ"))));

        System.out.println(novoContato);

        Estado pr = new Estado("Parana", "PR");
        Cidade sh = new Cidade("Santa Helena", pr);
        Endereco casaMarfim = new Endereco("Rua Marfim", 400, "Sao Luis", "85892-000", sh);

        Contato joao = new Contato("Joao Pedro", casaMarfim);
        List<Telefone> telefones = new ArrayList<>();
        Telefone telefone1 = new Telefone("24992943436");
        Telefone telefone2 = new Telefone("24992943436");
        telefones.add(telefone1);
        telefones.add(telefone2);
        joao.setTelefones(telefones);
        System.out.println(joao);
    }
}
