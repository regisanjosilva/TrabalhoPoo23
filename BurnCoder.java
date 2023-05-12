public class BurnCoder extends Criatura{
	private String nome = "BurnCoder";
	public BurnCoder() {
		super(Tipos.FOGO);
	}
		
	@Override
	public void levarAtaqueElemental(Criatura adversaria) {
		int dano = 0;
		switch (adversaria.getTipo()) {
			case Tipos.TERRA:
			case Tipos.AR:	
				calcularDano(Criatura adversaria,this.criatura);
				break;
			case Tipos.AGUA:
				dano = (adversaria.getPoder() * adversaria.getAtaque())/(getDefesa() * 2);
				receberDano(dano);
				break;
			default:
			System.out.println("Erro")
				break;
		}
		@Override
	public void criarMensagemDeAtaque()	{
		// criar mensagem personalizada para a classe
	}
}