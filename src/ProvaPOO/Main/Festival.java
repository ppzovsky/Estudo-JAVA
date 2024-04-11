package ProvaPOO.Main;

import ProvaPOO.Classes.*;

public class Festival {
    public static void main(String[] args) {

        Palco palcoMundo = new Palco("Palco Mundo", 100000);
        Palco palcoSunset = new Palco("Palco Sunset", 50000);

        Cantor ferrugem = new Cantor("Ferrugem", Genero.PAGODE, 100000.0, "Portugues");
        Cantor beyonce = new Cantor("Beyonce", Genero.POP, 15000000.0, "Ingles");
        Banda slipknot = new Banda("Slipknot", Genero.ROCK, 800000.0, 8);
        Banda acdc = new Banda("ACDC", Genero.ROCK, 950000.0, 6);
        DJ alok = new DJ("Alok", Genero.ELETRONICA, 80000.0, "Brazilian-Bass");
        Cantor bk = new Cantor("BK' ", Genero.RAP, 100000.0, "Portugues");

        palcoSunset.adicionaHorario(new Show(ferrugem, new Horario("25/04/2024", "20:00")));
        palcoSunset.adicionaHorario(new Show(alok, new Horario("25/04/2024", "21:00")));

        palcoMundo.adicionaHorario(new Show(bk, new Horario("25/04/2024", "20:00")));
        palcoMundo.adicionaHorario(new Show(acdc, new Horario("25/04/2024", "21:00")));
        palcoMundo.adicionaHorario(new Show(slipknot, new Horario("25/04/2024", "22:00")));
        palcoMundo.adicionaHorario(new Show(beyonce, new Horario("26/04/2024", "00:00")));

        System.out.println("\n\n\n\t\t\t\t\tBEM VINDO AO ROCK IN RIO\n");
        System.out.println(alok);
        System.out.println(palcoSunset);
        System.out.println(palcoMundo);

    }
}