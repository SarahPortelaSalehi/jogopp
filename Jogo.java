package packge.busyness;


public class Jogo {
	
	public static void ControlarAcoesDosPersonagens(Personagem personagem) {
		
		if (personagem instanceof Cavaleiro) {
			Cavaleiro cavaleiro = (Cavaleiro)personagem;
			cavaleiro.atacar();
			cavaleiro.defender();
			cavaleiro.saltar();
			cavaleiro.andar();
			cavaleiro.guardarItem();
			cavaleiro.usarItem();
			
		}else if (personagem instanceof Mago) {
			Mago mago = (Mago)personagem;
			mago.invisibilidade();
			mago.ultraRapidez();
			mago.andar();
			mago.guardarItem();
			mago.usarItem();
			
		}else if (personagem instanceof Dragao) {
			Dragao dragao = (Dragao)personagem;
			dragao.atirarFogo();
			dragao.voar();
			dragao.morder();
			dragao.andar();
			dragao.guardarItem();
			dragao.usarItem();
			
		}
		
		
	}


}
