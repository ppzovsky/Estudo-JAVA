package ProvaPOO.Classes;

public class Horario {

    private String data;
    private String hora;

    public Horario(String data, String hora) {
        this.data = data;
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return String.format("""
                Data: %s   |  Horario: %s
                """, data, hora);
    }
}
