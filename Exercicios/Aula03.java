package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o primeiro número.");
        int numero1 = scanner.nextInt();
        System.out.println("Escreva o segundo número.");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos dois números é: " + soma);
    }
}
