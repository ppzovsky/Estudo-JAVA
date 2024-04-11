package ProvaPOO.Classes;

public class Banda extends Artista {

    private int numeroIntegrantes;

    public Banda(String nome, Genero genero, double cache, int numeroIntegrantes) {
        super(nome, genero, cache);
        this.numeroIntegrantes = numeroIntegrantes;
    }
    @Override
    public String toString() {
        return super.toString()+String.format("""
                Numero de Integrantes: %s
                """, numeroIntegrantes);
    }
}

