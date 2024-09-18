package encaps;

public class ObjetoContaBancaria {
	public static void main (String[]args) {
		ContaBancaria conta = new ContaBancaria(10000.00);
		
		System.out.println(conta.getSaldo());
		
		conta.depositar(500);
		conta.depositar(1500);
		
		System.out.println(conta.getSaldo());
		conta.sacar(2000);
		
		System.out.println(conta.getSaldo());
	}
}
