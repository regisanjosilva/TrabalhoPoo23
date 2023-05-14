public class BurnCoder extends Criatura{
	private String nome = "BurnCoder";
	public BurnCoder() {
		super(Tipos.FOGO);
	}
		
	@Override
	public void levarAtaqueElemental(Criatura criaturaAtacando,Criatura criaturaSendoAtacada) {
		int dano = 0;
		switch (criaturaAtacando.getTipo()) {
			case TERRA:
			case AR:	
				calcularDano(criaturaAtacando,criaturaSendoAtacada);
				break;
			case AGUA:
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
        return new Criatura[]{new BreezeHacker(), new StoneDev(), new WaveNerd()};
    }

		@Override
	public void criarMensagemDeAtaque()	{
		// criar mensagem personalizada para a classe
	}
}