package packege.business;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {
	
	
	public Cavaleiro(String nome) {	
		super(nome);
	}

	
	public void atacar() {
		System.out.printf("Cavaleiro [%s] está atacando o Inimigo", getNome());

	}

	
	public void defender() {
		System.out.printf("Cavaleiro [%s] está se defendendo contra um ataque", getNome());

	}

	
	public void saltar() {
		System.out.printf("Cavaleiro [%s] saltou", getNome());

	}


	
	public void andar() {
		System.out.printf("Cavaleiro [%s] está andando", getNome());
		
	}


	
	public void guardarItem() {
		System.out.printf("Cavaleiro [%s] está guardando a espada Sagrada", getNome());
		
	}


	
	public void usarItem() {
		System.out.printf("Cavaleiro [%s] usou a poção revitalizadora", getNome());
		
	}

}
