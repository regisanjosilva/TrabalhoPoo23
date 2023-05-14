public class StoneDev extends Criatura {
	private String nome = "StoneDev";
	public StoneDev() {
		super(Tipos.TERRA);
	}
	@Override
	public void levarAtaqueElemental(Criatura criaturaAtacando,Criatura criaturaSendoAtacada) {
		int dano = 0;
		switch (criaturaAtacando.getTipo()) {
			case Tipos.AGUA:
			case Tipos.FOGO:	
				calcularDano(criaturaAtacando,criaturaSendoAtacada);
				break;
			case Tipos.AR:
				dano = (criaturaAtacando.getPoder() * criaturaAtacando.getAtaque())/(criaturaSendoAtacada.getDefesa() * 2);
				receberDano(dano);
				break;
			default:
			System.out.println("Erro")
				break;
		}
	}

	@Override
	public Criatura criarListaDeAdversarios(){
		return Criatura adversarios[] = {new BurnCoder,new BreezeHacker,new WaveNerd};
	}

	@Override
	public void criarMensagemDeAtaque()	{
		// criar mensagem personalizada para a classe
	}
}