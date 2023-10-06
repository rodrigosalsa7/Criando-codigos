package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Celsius: ");
        double temperaturaC = scanner.nextDouble();

        double temperaturaF = (temperaturaC * 9/5) + 32;

        System.out.println("A temperatura em Farenheit é de: " + temperaturaF);

    }
}
