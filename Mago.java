package packege.business;

public class Mago extends Personagem implements ComportamentoMagico {
	
	public Mago(String nome) {
		super(nome);
	}

	public void invisibilidade() {
		System.out.println();
		System.out.printf("🧙 ✨ Mago [%s] usou a habilidade de invisibilidade", getNome());
	}

	public void ultraRapidez() {
		System.out.println();
		System.out.printf("🧙 ✨ Mago [%s] usou a habilidade de ultra rapidez", getNome());

	}

	public void andar() {
		System.out.println();
		System.out.printf("🧙 ✨ Mago [%s] está andando", getNome());
		
	}

	public void guardarItem() {
		System.out.println();
		System.out.printf("🧙 ✨ Mago [%s] guardou seu livro encantado", getNome());
		
	}

	public void usarItem() {
		System.out.println();
		System.out.printf("🧙 ✨ Mago [%s] usou a poção de energia", getNome());
		
	}

}
