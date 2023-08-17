package javainiciante;

import java.util.Scanner;

public class CalculadoraComDoisNumeros {

	public static void main(String[] args) {
		// Calculadora com dois números.
		
		Scanner entrada = new Scanner(System.in);
		
		int x, y, soma, divisão, subtração, multiplicação;
		
		System.out.println("Digite o valor de X: ");
		x = entrada.nextInt();
		
		System.out.println("Digite o valor de Y: ");
		y = entrada.nextInt();
		
		soma = x+y;
		divisão = x/y;
		subtração = x-y;
		multiplicação = x*y;
		
		System.out.println("O valor da soma é: " + soma);
		System.out.println("O valor da divisão é: " + divisão);
		System.out.println("O valor da subtração é: " + subtração);
		System.out.println("O valor da multiplicação é: " + multiplicação);
		
		entrada.close();

	}

}
