public class WaveNerd extends Criatura {
	private String nome = "WaveNerd";
	public WaveNerd() {
		super(Tipos.AGUA);
	}
	@Override
	public void levarAtaqueElemental(Criatura adversaria) {
		int dano = 0;
		switch (criatura.getTipo()) {
			case Tipos.FOGO:
			case Tipos.AR:	
				calcularDano(Criatura adversaria,this.criatura);
				break;
			case Tipos.TERRA:
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