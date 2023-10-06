package MeuProjetoJava.IfElseESwitchCase;

import java.util.Scanner;

public class Exercício1 {

    //programa que pede dois números e imprime o maior deles
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número.");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("Esse número é o maior: " + numero1);
        } else {
            System.out.println("Esse número é o maior: " + numero2);
        }


    }
}
