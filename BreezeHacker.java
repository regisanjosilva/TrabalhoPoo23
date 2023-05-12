public class BreezeHacker extends Criatura {
	private String nome = "BreezeHacker";
	public BreezeHacker() {
		super(Tipos.AR);
	}
	@Override
	public void levarAtaqueElemental(Criatura adversaria) {
		int dano = 0;
		switch (adversaria.getTipo()) {
			case Tipos.TERRA:
			case Tipos.AGUA:	
				calcularDano(Criatura adversaria,this.criatura);
				break;
			case Tipos.FOGO:
				dano = (adversaria.getPoder() * adversaria.getAtaque())/(getDefesa() * 2);
				receberDano(dano);
				break;
			default:
			System.out.println("Erro")
				break;
		}
	}
	@Override
	public void criarMensagemDeAtaque()	{
		// criar mensagem personalizada para a classe
	}
}