package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula08 {
    public static void main(String[] args) {
        //programa que pergunta o valor que ganha por hora, o número de horas trabalhadas no mês e informe o salário.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor que ganha por hora: ");
        double valor = scanner.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        double horas = scanner.nextDouble();

        double salario = valor * horas;
        System.out.println("O seu salário mensal é de: R$ " + salario);
    }
}
