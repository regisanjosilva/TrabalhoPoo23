public class WaveNerd extends Criatura {
	Tipos tipo = Tipos.AGUA;
	public WaveNerd() {
		super();
	}
	@Override
	public int ataqueElemental(int poder, int ataque, int defesa, int fator,Tipos tipo) {
		int dano = 0;
		switch (tipo) {
		case AR:
			dano = (poder * ataque)/(defesa * 1);
			break;
		case FOGO:
			dano = (poder * ataque)/(defesa * 2);
			break;
		case TERRA:
			dano = (int) ((poder * ataque)/(defesa * 1));
			break;
		default:
			System.out.println("Erro");
		}
			return dano;	
	}
	

}
