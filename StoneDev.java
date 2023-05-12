public class StoneDev extends Criatura {
	private String nome = "StoneDev";
	public StoneDev() {
		super(Tipos.TERRA);
	}
	@Override
	public void levarAtaqueElemental(Criatura adversaria) {
		int dano = 0;
		switch (criatura.getTipo()) {
			case Tipos.AGUA:
			case Tipos.FOGO:	
				calcularDano(Criatura adversaria,this.criatura);
				break;
			case Tipos.AR:
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