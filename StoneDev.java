public class StoneDev extends Criatura implements FalaCriatura{
	private String NOME = "StoneDev";
	public StoneDev() {
		super(Tipo.TERRA);
	}
	public String getNOME() {
		return NOME;
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
	public String mensagemCriaturaCriada(){
		return System.out.printf("\nCuidado!!! A poderosa criatura %s surgiu na batalha!\n\nEsses são os atributos dela:\nTipo: %s\nPontos de vida: %d\nPoder: %d\nAtaque: %d\nDefesa: %d\nVelocidade: %d\n",
		getNOME(),getTipo().toString(),getPontoDeVida(),getPoder(),getAtaque(),getDefesa(),getVelocidade()).toString();
	}

	@Override
	public void criarMensagemDeAtaqueFisico()	{
		System.out.println("Prepare-se para ser esmagado pela força da terra!");
	}

	@Override
	public void criarMensagemDeAtaqueElemental() {
		System.out.println("Meu ataque elemental fará você ser soterrado pela pela minha chuva de pedras!");
	}


}