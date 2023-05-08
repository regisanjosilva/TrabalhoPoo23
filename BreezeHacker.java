public class BreezeHacker extends Criatura {
	Tipos tipo = Tipos.AR;
	public BreezeHacker() {
		super();
	}
	@Override
	public int ataqueElemental(int poder, int ataque, int defesa, int fator,Tipos tipo) {
		int dano = 0;
		switch (tipo) {
		case TERRA:
			dano = (poder * ataque)/(defesa * 2);
			break;
		case FOGO:
			dano = (poder * ataque)/(defesa * 1);
			break;
		case AGUA:
			dano = (int) ((poder * ataque)/(defesa * 1));
			break;
		default:
			System.out.println("Erro");
		}
			return dano;	
	}
}
