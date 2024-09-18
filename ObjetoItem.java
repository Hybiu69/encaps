package encaps;

public class ObjetoItem {
	public static void main(String[] args) {
		item item = new item ("Computador", "bom", 123456789);
		item item1 = new item ();
		
		item1.setDescricao("Ótimo");
		item1.setId(987654321);
		item1.setNome("Notebook");
		
		System.out.println("Nome: "+item1.getNome());
		System.out.println("Id: "+item1.getId());
		System.out.println("Descrição: "+item1.getDescricao());
		
		
		
		item.exibirInformacoes ();

	}
}