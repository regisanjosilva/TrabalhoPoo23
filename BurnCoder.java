public class BurnCoder extends Criatura{
	Tipos tipo = Tipos.FOGO;
	public BurnCoder() {
		super();
	}
		
	@Override
	public int ataqueElemental(int poder, int ataque, int defesa, int fator,Tipos tipo) {
		int dano = 0;
		switch (tipo) {
		case AR:
			dano = (poder * ataque)/(defesa * 2);
			break;
		case TERRA:
			dano = (poder * ataque)/(defesa * 1);
			break;
		case AGUA:
			dano = (poder * ataque)/(defesa * 1);
			break;
		default:
			System.out.println("Erro");
		}
			return dano;	
	}

}
