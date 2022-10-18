package packege.business;

public abstract class Personagem implements ComportamentoNormal{
	
	private String nome;
	
	public Personagem(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}