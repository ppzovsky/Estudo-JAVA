package ProvaPOO.Classes;

public class Show {
    private Artista artista;
    private Horario horario;

    public Artista getArtista() {
        return artista;
    }

    public Horario getHorario() {
        return horario;
    }

    public Show(Artista artista, Horario horario) {
        this.artista = artista;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return  "\n" + horario +
                "Artista:" + artista.getNome() +
                "\nGenero:" + artista.getGenero() + "\n";
    }
}
