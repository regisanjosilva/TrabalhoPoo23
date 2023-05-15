public class BurnCoder extends Criatura implements FalaCriatura{
	private String NOME = "BurnCoder";
	public BurnCoder() {
		super(Tipo.FOGO);
	}
	public String getNOME() {
		return NOME;
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
	public String mensagemCriaturaCriada(){
		return System.out.printf("\nCuidado!!! A poderosa criatura %s surgiu na batalha!\n\nEsses são os atributos dela:\nTipo: %s\nPontos de vida: %d\nPoder: %d\nAtaque: %d\nDefesa: %d\nVelocidade: %d\n",
		getNOME(),getTipo().toString(),getPontoDeVida(),getPoder(),getAtaque(),getDefesa(),getVelocidade()).toString();
	}

		@Override
	public void criarMensagemDeAtaqueFisico()	{
		System.out.println("Sinta o calor da minha ira!");
	}

	@Override
	public void criarMensagemDeAtaqueElemental()	{
		System.out.println("Meu ataque elemental fará você ser carbonizado pela pela minha chuva de lava!");
	}
}