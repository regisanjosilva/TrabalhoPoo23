public class BurnCoder extends Criatura{
	private String nome = "BurnCoder";
	public BurnCoder() {
		super(Tipos.FOGO);
	}
		
	@Override
	public void levarAtaqueElemental(Criatura criaturaAtacando,Criatura criaturaSendoAtacada) {
		int dano = 0;
		switch (criaturaAtacando.getTipo()) {
			case Tipos.TERRA:
			case Tipos.AR:	
				calcularDano(criaturaAtacando,criaturaSendoAtacada);
				break;
			case Tipos.AGUA:
				dano = (criaturaAtacando.getPoder() * criaturaAtacando.getAtaque())/(criaturaSendoAtacada.getDefesa() * 2);
				receberDano(dano);
				break;
			default:
			System.out.println("Erro")
				break;
		}

		@Override
	public Criatura criarListaDeAdversarios(){
		return Criatura adversarios[] = {new WaveNerd,new StoneDev,new BreezeHacker};
	}

		@Override
	public void criarMensagemDeAtaque()	{
		// criar mensagem personalizada para a classe
	}
}