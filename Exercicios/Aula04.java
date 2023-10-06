package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a sua primeira nota.");
        int nota1 = scanner.nextInt();
        System.out.println("Escreva a sua segunda nota.");
        int nota2 = scanner.nextInt();
        System.out.println("Escreva a sua terceira nota.");
        int nota3 = scanner.nextInt();
        System.out.println("Escreva a sua quarta nota.");
        int nota4 = scanner.nextInt();

        int média = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média bimestral foi: " + média);

    }
}
