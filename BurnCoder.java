public class BurnCoder extends Criatura{
	
	public BurnCoder() {
		super(Tipos.FOGO);
	}
		
	@Override
	public void levarAtaqueElemental(Criatura criatura) {
		int dano = 0;
		switch (criatura.getTipo()) {
		case AR:
			dano = (poder * ataque)/(defesa * 1);
			break;
		case TERRA:
			dano = (poder * ataque)/(defesa * 1);
			break;
		case AGUA:
			dano = (poder * ataque)/(defesa * 2);
			break;
		default:
			System.out.println("Erro");
		}
		receberDano(dano);		
	}

}
