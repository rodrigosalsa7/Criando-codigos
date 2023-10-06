package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Farenheit: ");
        double temperaturaF = scanner.nextDouble();

        double temperaturaC = (5 * (temperaturaF-32)/9);
        System.out.println("A temperatura em Celsius é: " + temperaturaC);

    }
}
