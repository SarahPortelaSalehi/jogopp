package packege.apresentetion;

import java.util.ArrayList;

import packege.business.Cavaleiro;
import packege.business.Dragao;
import packege.business.Mago;
import packege.business.Personagem;


public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<Personagem> personagens;
		
		personagens = new ArrayList<Personagem>();

		Cavaleiro Edward = new Cavaleiro("Edward");
		personagens.add(Edward);
		
		Cavaleiro Gilbert = new Cavaleiro("Gilbert");
		personagens.add(Gilbert);
		
		Dragao Lili = new Dragao("Lili");
		personagens.add(Lili);
		
		Dragao Dracarys = new Dragao("Dracarys");
		personagens.add(Dracarys);
		
		Mago Gargamel = new Mago("Gargamel");
		personagens.add(Gargamel);
		
		Mago Piririm = new Mago("Piririm Pimpim");
		personagens.add(Piririm);
		

		
	}
}
