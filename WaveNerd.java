public class WaveNerd extends Criatura {
	
	public WaveNerd() {
		super(Tipos.AGUA);
	}
	@Override
	public void levarAtaqueElemental(Criatura adversaria) {
		int dano = calcularDano(adversaria);
		receberDano(dano);	
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
