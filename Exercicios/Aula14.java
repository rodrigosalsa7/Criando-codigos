package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade.");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade, pode entrar.");
        } else {
            System.out.println("Você não é maior de idade, não pode entrar.");
        }

    }
}
