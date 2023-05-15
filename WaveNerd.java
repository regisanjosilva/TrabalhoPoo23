public class WaveNerd extends Criatura{
	private static String NOME = "WaveNerd";
	public WaveNerd() {
		super(Tipo.AGUA,NOME);
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
	public String criarMensagemCriaturaCriada(){
		return "\nA poderosa criatura " + getNome() + " surgiu na batalha!\n\nEsses são os atributos dela:\nTipo: " + getTipo().toString() + "\nPontos de vida: "+ getPontoDeVida() + " \nPoder: " + getPoder() + "\nAtaque: " + getAtaque() + "\nDefesa: " + getDefesa() + "\nVelocidade: " + getVelocidade() + "\n\n";
	}

	@Override
	public void criarMensagemDeAtaqueFisico()	{
		System.out.printf("\nPrepare-se para ser engolido pelas ondas implacáveis!\n");
	}

	@Override
	public void criarMensagemDeAtaqueElemental()	{
		System.out.printf("\nMeu ataque elemental é um grande maremoto, acho melhor você procurar um lugar em terra firme!\n");
	}
}