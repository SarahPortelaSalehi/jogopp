package packege.business;

public class Mago extends Personagem implements ComportamentoMagico {
	
	public Mago(String nome) {
		super(nome);
	}

	@Override
	public void invisibilidade() {
		System.out.printf("Mago [%s] usou a habilidade de invisibilidade", getNome());
	}

	@Override
	public void ultraRapidez() {
		System.out.printf("Mago [%s] usou a habilidade de ultra rapidez", getNome());

	}

	@Override
	public void andar() {
		System.out.printf("Mago [%s] está andando", getNome());
		
	}

	@Override
	public void guardarItem() {
		System.out.printf("Mago [%s] guardou seu livro encantado", getNome());
		
	}

	@Override
	public void usarItem() {
		System.out.printf("Mago [%s] usou a poção de energia", getNome());
		
	}

}
