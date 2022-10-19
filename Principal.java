package packege.apresentation;

import java.util.ArrayList;

import packege.business.Cavaleiro;
import packege.business.Dragao;
import packege.business.Mago;
import packege.business.Personagem;
import packege.business.Jogo;


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
		
		Mago Veigar = new Mago("Veigar");
		personagens.add(Veigar);
		
		Jogo objeto = new Jogo();
		
		Personagem p = new Mago("Gandalf");
		((Mago)p).invisibilidade();
		
		
		System.out.println("░M░E░D░I░E░V░A░L░ ░G░A░M░E░");
		
		System.out.println();
		System.out.print(" ☰ ☰ ☰ KNIGHTS ☰ ☰ ☰ ");
		objeto.ControlarAcoesDosPersonagens(Edward);
		objeto.ControlarAcoesDosPersonagens(Gilbert);
		
		
		System.out.println();
		System.out.print("\n ☰ ☰ ☰ WIZARDS ☰ ☰ ☰ ");
		objeto.ControlarAcoesDosPersonagens(Gargamel);
		objeto.ControlarAcoesDosPersonagens(Veigar);
		
		System.out.println();
		System.out.print("\n ☰ ☰ ☰ DRAGONS ☰ ☰ ☰ ");
		objeto.ControlarAcoesDosPersonagens(Lili);
		objeto.ControlarAcoesDosPersonagens(Dracarys);
		
		
		
		
		

		
	}
}
