package javainiciante;

import java.util.Scanner;

public class CarroNovo {

	public static void main(String[] args) {
		// Preço do carro.
		
		double precoCarro, precoFinal;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe o valor de fábrica do carro: R$ ");
		precoCarro = entrada.nextDouble();
		
		precoFinal = precoCarro + precoCarro*0.30 + precoCarro*0.48;
		
		System.out.println("O preço final que o consumidor deve pagar por este carro é de: R$ " + precoFinal);
		
		entrada.close();
		
		

	}

}
