package MeuProjetoJava;

public class ContaTeste {

	public static void main(String[] args) {
		
		conta conta = new conta();
		conta.Cliente = "Rodrigo Salsa";
		conta.saldo = 12_000;
		conta.exibesaldo();
		
		//conta.saque(2000);
		//conta.exibesaldo();
		
		//conta.deposito(5000);
		//conta.exibesaldo();
		
		//conta destino = new conta();
		//destino.Cliente = "Bruna Guimarães de Barros Leal dos Santos";
		//destino.saldo = 5_000;
		//destino.exibesaldo();
	}

}
