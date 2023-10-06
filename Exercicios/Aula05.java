package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        //converter metros para cm.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva a quantidade de metros.");
        double metros = scanner.nextDouble();

        // 1m = 100 cm.

        double cm = metros * 100;
        System.out.println("A quantidade de cm adotadas é de: " + cm);
    }
}
