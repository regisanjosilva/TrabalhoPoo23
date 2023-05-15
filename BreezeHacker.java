public class BreezeHacker extends Criatura {
	private final static String NOME = "BreezeHacker";
	public BreezeHacker() {
		super(Tipo.AR,NOME);
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
	public String criarMensagemCriaturaCriada(){
		return "\nA poderosa criatura " + getNome() + " surgiu na batalha!\n\nEsses são os atributos dela:\nTipo: " + getTipo().toString() + "\nPontos de vida: "+ getPontoDeVida() + " \nPoder: " + getPoder() + "\nAtaque: " + getAtaque() + "\nDefesa: " + getDefesa() + "\nVelocidade: " + getVelocidade() + "\n\n";
	}

	@Override
	public void criarMensagemDeAtaqueFisico()	{
		System.out.printf("\nPrepare-se para ser varrido pela fúria dos ventos!\n");
	}

	@Override
	public void criarMensagemDeAtaqueElemental()	{
		System.out.printf("\nMeu ataque elemental fará você voar para longe, com a força do meu ciclone!\n");
	}
}