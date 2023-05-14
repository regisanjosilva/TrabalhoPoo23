public class BreezeHacker extends Criatura {
	private String nome = "BreezeHacker";
	public BreezeHacker() {
		super(Tipos.AR);
	}
	@Override
	public void levarAtaqueElemental(Criatura criaturaAtacando,Criatura criaturaSendoAtacada) {
		int dano = 0;
		switch (criaturaAtacando.getTipo()) {
			case Tipos.TERRA:
			case Tipos.AGUA:	
				calcularDano(criaturaAtacando,criaturaSendoAtacada);
				break;
			case Tipos.FOGO:
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
		return Criatura adversarios[] = {new BurnCoder,new StoneDev,new WaveNerd};
	}

	@Override
	public void criarMensagemDeAtaque()	{
		// criar mensagem personalizada para a classe
	}
}