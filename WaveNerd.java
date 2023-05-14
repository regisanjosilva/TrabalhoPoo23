public class WaveNerd extends Criatura {
	private String nome = "WaveNerd";
	public WaveNerd() {
		super(Tipos.AGUA);
	}
	@Override
	public void levarAtaqueElemental(Criatura criaturaAtacando,Criatura criaturaSendoAtacada) {
		int dano = 0;
		switch (criaturaAtacando.getTipo()) {
			case FOGO:
			case AR:	
				calcularDano(criaturaAtacando,criaturaSendoAtacada);
				break;
			case TERRA:
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
        return new Criatura[]{new BurnCoder(), new StoneDev(), new BreezeHacker()};
    }

	@Override
	public void criarMensagemDeAtaque()	{
		// criar mensagem personalizada para a classe
	}
}