package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Informe o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        System.out.println("Informe o número real: ");
        double numero3 = scanner.nextDouble();

        int produto = 2 * numero1 + 2 / numero2;
        double soma = 3 * numero1 + numero3;
        double triplo = Math.pow(numero3,3);

        System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + produto);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + soma);
        System.out.println("O triplo do terceiro número é: " + triplo);

    }
}
