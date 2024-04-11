package ProvaPOO.Classes;

public class Cantor extends Artista {

    private String idioma;

    public Cantor(String nome, Genero genero, double cache, String idioma) {
        super(nome, genero, cache);
        this.idioma = idioma;
    }
    @Override
    public String toString() {
        return super.toString()+String.format("""
                Idioma: %s
                """, idioma);
    }
}