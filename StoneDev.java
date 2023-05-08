
public class StoneDev extends Criatura {
	Tipos tipo = Tipos.TERRA;
	public StoneDev() {
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
			dano = (poder * ataque)/(defesa * 1);
			break;
		case AGUA:
			dano = (int) ((poder * ataque)/(defesa * 2));
			break;
		default:
			System.out.println("Erro");
		}
			return dano;	
	}

}
