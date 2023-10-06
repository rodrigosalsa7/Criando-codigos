package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {
        //programa que calcule o raio de um círculo e mostre a sua área

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio,2);
        System.out.println("Sua área é de: " + area);
    }
}
