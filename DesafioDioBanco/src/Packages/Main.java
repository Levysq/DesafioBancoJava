package Packages;

public class Main {

	public static void main(String[] args) {
		Cliente Levy = new Cliente();
		Levy.setNome("Levy");
		
		iConta cc = new ContaCorrente(Levy);
		cc.depositar(100);
		iConta poupanca = new ContaPoupanca(Levy);
		cc.transferir(50, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
