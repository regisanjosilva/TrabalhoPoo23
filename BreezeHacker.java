public class BreezeHacker extends Criatura {
	
	public BreezeHacker() {
		super(Tipos.AR);
	}
	@Override
	public void levarAtaqueElemental(Criatura criatura) {
		int dano = 0;
		if (criatura.getTipo() == Tipos.FOGO) {
			dano = (criatura.getPoder() * criatura.getAtaque())/(getDefesa() * 2);
			receberDano(dano);	

	}else {
		dano = (criatura.getPoder() * criatura.getAtaque())/(getDefesa());
		receberDano(dano);
		//utiliza o mesmo método para realizar ataque, só entrega o valor diferente
		}
	}		
}
