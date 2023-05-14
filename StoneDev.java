public class StoneDev extends Criatura {
	private String nome = "StoneDev";
	public StoneDev() {
		super(Tipos.TERRA);
	}
	@Override
	public void levarAtaqueElemental(Criatura criaturaAtacando,Criatura criaturaSendoAtacada) {
		int dano = 0;
		switch (criaturaAtacando.getTipo()) {
			case AGUA:
			case FOGO:	
				calcularDano(criaturaAtacando,criaturaSendoAtacada);
				break;
			case AR:
				dano = (criaturaAtacando.getPoder() * criaturaAtacando.getAtaque())/(criaturaSendoAtacada.getDefesa() * 2);
				receberDano(dano);
				break;
			default:
			System.out.println("Erro");
				break;
		}
	}

	@Override
    public Criatura[] criarInimigos() {
        return new Criatura[]{new BurnCoder(), new BreezeHacker(), new WaveNerd()};
    }

	@Override
	public void criarMensagemDeAtaque()	{
		// criar mensagem personalizada para a classe
	}
}