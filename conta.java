package MeuProjetoJava;

public class conta {

	String Cliente;
	double saldo;
	
	void exibesaldo() {
		System.out.println(Cliente + "\nSeu Saldo é de: " + saldo);
	}
	
	void saque(double valor) {saldo -= valor;}
	
	void deposito(double valor) {
		saldo += valor;
	}
	
	void transferenciaValor(conta destino, double valor) {
		this.saque(valor);
		destino.depositar(valor);
	}

	private void depositar(double valor) {
	}

}
