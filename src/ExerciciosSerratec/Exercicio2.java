package ExerciciosSerratec;
public class Exercicio2 {
    public Exercicio2() {
    }

    public static void main(String[] args){

        Calcado tenis = new Calcado("Nike", 40, 359.90);

        tenis.estilo = "Street";
        tenis.cor = "Branco";
        tenis.modelo = "Air Max 280";

        //System.out.println(tenis);

        Calcado sandalia = new Calcado("Melissa", 35, 192.50);

        sandalia.estilo = "Flex";
        sandalia.cor = "Marfim";
        sandalia.modelo = "Luísa Sonza";

        //System.out.println(sandalia);

        Vendedor vendedor= new Vendedor("Felipe", "1222333",
                new Endereco("Rua Marfim",400, "São Luís", "85892000"));
        System.out.println(vendedor);
    }
}
