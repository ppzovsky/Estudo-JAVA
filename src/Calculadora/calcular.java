package Calculadora;

import java.util.Scanner;
public class calcular {
    public static void main(String[] args) {
        int x = 10;

        while(x > 0){
            int fecha;

            Scanner entrada = new Scanner(System.in);

            System.out.println("Pressione 1 para fechar, ou 2 para continuar: ");
            fecha = Integer.parseInt(entrada.nextLine());

            if(fecha == 1){
                x = -1;
            }
            if (fecha ==2){
                System.out.println("Digite o valor de x: ");
                double n1 = Double.parseDouble(entrada.nextLine());

                System.out.println("Digite o valor de y: ");
                double n2 = Double.parseDouble(entrada.next());


                System.out.print("x + y = "+(n1+n2+"\n"));
                System.out.print("x - y = "+(n1-n2+"\n"));
                System.out.print("x * y = "+(n1*n2+"\n"));
                System.out.print("x / y = "+(n1/n2+"\n"));
            }

        }
    }

}
