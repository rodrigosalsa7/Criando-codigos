package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class AulaNova14 {

    public static void main(String[] args) {

        //barato <= 10
        //pedir desconto 10 < valor < 15
        //pesquisar mais 15 <= 17
        // muito caro >= 17

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        double valor = scanner.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato, pode comprar.");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Pode pedir um desconto sobre o valor.");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Está muito caro o valor do produto");
        }
    }
}