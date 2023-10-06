package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) {
        //calcular o peso de uma pessoa de acordo com a altura.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7*altura) - 58;

        System.out.println("Seu peso ideal de acordo com a sua altura é: " + pesoIdeal);

    }
}
