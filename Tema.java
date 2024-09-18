package encaps;

public class Tema {
	private String nome;
	private double valorAluguel;
	private int id;
	private String corTolha;
	public Tema () {}
	public Tema (String nome, double valorAluguel, int id, String corTolha) {
		this.nome = nome;
		this.corTolha = corTolha;
		this.id = id;
		this.valorAluguel = valorAluguel;
	}
	public String getNome () {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getCorTolha () {
		return corTolha;
	}
	public void setCorTolha (String corTolha) {
		this.corTolha = corTolha;
	}
	public double getValorAluguel () {
		return valorAluguel;
	}
	public void setvalorAluguelalorAluguel (double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public int getId () {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
}