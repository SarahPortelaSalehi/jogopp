package packge.busyness;


public class Jogo {
	
	public static void ControlarAcoesDosPersonagens(Personagem personagem) {
		
		if (personagem instanceof Cavaleiro) {
			Cavaleiro cavaleiro = (Cavaleiro)personagem;
			
			cavaleiro.andar();
			cavaleiro.guardarItem();
			cavaleiro.usarItem();
			
		}else if (personagem instanceof Mago) {
			Mago mago = (Mago)personagem;
			
			mago.andar();
			mago.guardarItem();
			mago.usarItem();
			
		}else if (personagem instanceof Dragao) {
			Dragao dragao = (Dragao)personagem;
			
			dragao.andar();
			dragao.guardarItem();
			dragao.usarItem();
			
		}
		
		
	}


}
