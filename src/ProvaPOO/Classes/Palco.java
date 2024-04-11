package ProvaPOO.Classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {

    private String nome;
    private int capacidade;
    private List<Show> horarios;

    public Palco(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.horarios = new ArrayList<Show>();
    }

    public int getCapacidade() {
        return capacidade;
    }
    public void adicionaHorario(Show show) {
        horarios.add(show);
    }

    public void mostraShow(){
        for (Show horario : horarios){
            System.out.println();
        }
    }
    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                Capacidade: %d
                Horarios: %s
                """, nome, capacidade, horarios);
    }
}

