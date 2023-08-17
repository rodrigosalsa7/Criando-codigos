package javainiciante;

import java.util.Scanner;

public class ConsumoDoCarro {

	public static void main(String[] args) {
		// Determinar o consumo médio de um carro 
		
		Scanner input = new Scanner(System.in);
		
		double km1, km2, kmtotal1, litros1,litros2, consumo1, kmtotal2, consumo2, km3,km4;
		String nome1, nome2;
		
		System.out.println("Informe o nome do carro  número 1: ");
		nome1 = input.nextLine();
		
		System.out.println("Informe o nome do carro número 2: ");
		nome2 = input.nextLine();
		
		System.out.println("Informe o valor do KM inicial do 1° carro: ");
		km1 = input.nextInt();
		
		System.out.println("Informe o valor do KM final do 1° carro: ");
		km2 = input.nextInt();
		
		System.out.println("Informe o valor do KM inicial do 2° carro: ");
		km3 = input.nextInt();
		
		System.out.println("Informe o valor do KM final do 2° carro: ");
		km4 = input.nextInt();
		
		System.out.println("Informe o total de litros usado no caminho total do 1° carro: ");
		litros1 = input.nextInt();
		
		System.out.println("Informe o total de litros usado no caminho total do 2° carro: ");
		litros2 = input.nextInt();
		
		kmtotal1 = km2 - km1;
		kmtotal2 = km4 - km3;
		consumo2 = kmtotal2 - litros2;
		consumo1 = kmtotal1 / litros1;
		
		System.out.println("O total de KM percorrido do 1° carro foi de:  " + kmtotal1);
		System.out.println("O consumo do 1° carro foi de: " + consumo1);
		
		System.out.println("O total de KM percorrido do 1° carro foi de:  " + kmtotal2);
		System.out.println("O consumo do 2° carro foi de: " + consumo2);
		
		if(consumo1 < consumo2) {
			System.out.println("O carro mais economico é o 1° carro.");
		} else {
			System.out.println("O carro mais economico é o 2° carro.");
		}
		
		input.close();	

	}

}
