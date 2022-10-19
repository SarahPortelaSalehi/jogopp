package packege.business;

public class Dragao extends Personagem implements ComportamentoFeroz {
	
	
	public Dragao(String nome) {
		super(nome);
	}

	
	public void atirarFogo() {
		System.out.println();
		System.out.printf("🐉 🔥 Dragão [%s] atirou uma bola de fogo", getNome());

	}


	public void voar() {
		System.out.println();
		System.out.printf("🐉 🔥 Dragão [%s] está voando", getNome());

	}


	public void morder() {
		System.out.println();
		System.out.printf("🐉 🔥 Dragão [%s] mordeu seu alvo", getNome());

	}


	public void andar() {
		System.out.println();
		System.out.printf("🐉 🔥 Dragão [%s] está andando", getNome());
		
	}


	public void guardarItem() {
		System.out.println();
		System.out.printf("🐉 🔥 Dragão [%s] guardou o amuleto de fogo", getNome());
		
	}

	
	public void usarItem() {
		System.out.println();
		System.out.printf("🐉 🔥 Dragão [%s] usou o talismã dourado", getNome());
		
	}


}
