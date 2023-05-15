public class BreezeHacker extends Criatura implements FalaCriatura {
	private final String NOME = "BreezeHacker";
	public BreezeHacker() {
		super(Tipo.AR);
	}

	public String getNOME() {
		return NOME;
	}
	
	@Override
	public void levarAtaqueElemental(Criatura criaturaAtacando,Criatura criaturaSendoAtacada) {
		int dano = 0;
		switch (criaturaAtacando.getTipo()) {
			case TERRA:
			case AGUA:	
				calcularDano(criaturaAtacando,criaturaSendoAtacada);
				break;
			case FOGO:
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
        return new Criatura[]{new BurnCoder(), new StoneDev(), new WaveNerd()};
    }
	@Override
	public String mensagemCriaturaCriada(){
		return System.out.printf("\nCuidado!!! A poderosa criatura %s surgiu na batalha!\n\nEsses são os atributos dela:\nTipo: %s\nPontos de vida: %d\nPoder: %d\nAtaque: %d\nDefesa: %d\nVelocidade: %d\n",
		getNOME(),getTipo().toString(),getPontoDeVida(),getPoder(),getAtaque(),getDefesa(),getVelocidade()).toString();
	}

	@Override
	public void criarMensagemDeAtaqueFisico()	{
		System.out.println("Prepare-se para ser varrido pela fúria dos ventos!");
	}

	@Override
	public void criarMensagemDeAtaqueElemental()	{
		System.out.println("Meu ataque elemental fará você voar para longe, com a força do meu ciclone!");
	}
}