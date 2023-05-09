public class BreezeHacker extends Criatura {
	
	public BreezeHacker() {
		super(Tipos.AR);
	}
	@Override
	public void levarAtaqueElemental(Criatura criatura) {
		int dano = 0;
		switch (criatura.getTipo()) {
		case TERRA:
			dano = (poder * ataque)/(defesa * 1);
			break;
		case FOGO:
			dano = (poder * ataque)/(defesa * 2);
			break;
		case AGUA:
			dano = (int) ((poder * ataque)/(defesa * 1));
			break;
		default:
			System.out.println("Erro");
		}
		receberDano(dano);		
	}
}
