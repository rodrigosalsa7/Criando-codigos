package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula07 {
    public static void main(String[] args) {
        //calculando a área de um quadrado e depois mostrando o dobro dessa área.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o comprimento do quadrado: ");
        double comprimento = scanner.nextDouble();
        System.out.println("Informe a largura do quadrado: ");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;
        System.out.println("A área desse quadrado é: " + area);

        double dobroDaArea = area * 2;
        System.out.println("O dobro da área do quadrado é: " + dobroDaArea);
    }
}
