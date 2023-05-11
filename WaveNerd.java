public class WaveNerd extends Criatura {
	
	public WaveNerd() {
		super(Tipos.AGUA);
	}
	@Override
	public void levarAtaqueElemental(Criatura criatura) {
		int dano = 0;
		if (criatura.getTipo() == Tipos.AR) {
			dano = (criatura.getPoder() * criatura.getAtaque())/(adversaria.getDefesa() * 2);
			receberDano(dano);	

	}else {
		dano = (criatura.getPoder() * criatura.getAtaque())/(adversaria.getDefesa());
		receberDano(dano);
		//utiliza o mesmo método para realizar ataque, só entrega o valor diferente
		}
	}	
	
	private int calcularDano(Criatura adversaria) {
		int dano = 0;
		if(adversaria.getTipo() == Tipos.TERRA) {
			return dano = (int)((adversaria.getPoder() * adversaria.getAtaque())/(getDefesa() * 2));
		}else {
			return dano = (int)((adversaria.getPoder() * adversaria.getAtaque())/(getDefesa() * 1));
		}
	}
}
