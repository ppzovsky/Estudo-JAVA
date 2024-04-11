package ProvaPOO.Classes;

public class DJ extends Artista {
    private String estilo;

    public DJ(String nome, Genero genero, double cache, String estilo) {
        super(nome, genero, cache);
        this.estilo = estilo;
    }
    @Override
    public String toString() {
        return super.toString()+String.format("""
                Estilo: %s
                """, estilo);
    }
}

