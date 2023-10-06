package MeuProjetoJava.Exercicios;

import java.util.Scanner;

public class Aula13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora: ");
        double valorHora = scanner.nextDouble();
        System.out.println("Informe a quantidade de horas que trabalha no mês: ");
        double horas = scanner.nextDouble();

        double salario = valorHora * horas;
        double impostoDeRenda = salario * 0.11;
        double INSS = salario * 0.08;
        double sindicato = salario * 0.05;

        double salarioComDesconto = salario - impostoDeRenda - INSS - sindicato;


        System.out.println("O valor do INSS é de: R$ " + INSS);
        System.out.println("O valor que pagou ao sindicato é de: R$ " + sindicato);
        System.out.println("Seu salário mensal é de: R$" + salario);
        System.out.println("Seu salário liquido é de: R$" + salarioComDesconto);
    }
}
