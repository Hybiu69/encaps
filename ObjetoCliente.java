package encaps;

public class ObjetoCliente {

	public static void main (String [] args) {

		Cliente cliente = new Cliente ("Gustavo", 56891, "15998653", "47801553802", "56432190");
		Cliente cliente1= new Cliente();
		cliente.ExibirInfo();
		
		cliente1.setNome("Nome: Gustavo: ");
		System.out.println(cliente1.getNome());
		cliente1.setId(56891);
		System.out.println(cliente1.getId());
		cliente1.setTelefone( "Telefone: 15998653");
		System.out.println(cliente1.getTelefone());
		cliente1.setCpf("Cpf: 7896542135");
		System.out.println(cliente1.getCpf());
		cliente1.setRg("Rg: 74152698");
		System.out.println(cliente1.getRg());
		

	}
}