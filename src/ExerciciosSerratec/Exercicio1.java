package ExerciciosSerratec;

import java.util.Scanner;
public class Exercicio1 {
        public static void main(String[] args) {
            int num1, num2;
            String continua = "S";

            Scanner leitura = new Scanner(System.in);

            while (continua.equalsIgnoreCase("S")) {
                System.out.println("Digite o primeiro número: ");
                num1 = leitura.nextInt();

                System.out.println("Digite o segundo número: ");
                num2 = leitura.nextInt();

                leitura.nextLine();

                System.out.println("Soma: " + (num1 + num2));

                if (num2 > num1) {
                    System.out.println("Não posso subtrair!");
                }
                else {
                    System.out.println("Subtração: " + (num1 - num2));
                }

                System.out.println("Multiplicação: " + (num1 * num2));

                if (num2 == 0) {
                    System.out.println("Não posso dividir por zero!");
                }
                else {
                    System.out.println("Divisão: " + (num1 / num2));
                }

                System.out.println("Deseja continua? (S/N)");
                continua = leitura.nextLine();

            }
            leitura.close();
        }
    }