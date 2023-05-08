import java.util.Random;

public abstract class Criatura {
	private static final Random random = new Random();
	private int poder;
	private int ataque;
	private int defesa;
	private int velocidade;
	private int pontoDeVida;
	
	public Criatura() {
		this.poder = 10 + random.nextInt(21);
		this.ataque = 5 + random.nextInt(11);
		this.defesa = 5 + random.nextInt(11);
		this.velocidade = 1 + random.nextInt(10);
		this.pontoDeVida = 200 + random.nextInt(201);
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPontoDeVida() {
		return pontoDeVida;
	}

	public void setPontoDeVida(int pontoDeVida) {
		this.pontoDeVida = pontoDeVida;
	}
	
	// Metodos
	@Override
	public String toString() {
		return String.format("Poder: %d%nAtaque: %d%nDefesa: %d%nVelocidade: %d%nPonto de vida: %d",
				this.poder,this.ataque,this.defesa,
				this.velocidade,this.pontoDeVida);
	}
	
	public static double ataque(int poder, int ataque, int defesa) {
		return (poder*ataque) / defesa;
	}
	
	public abstract int ataqueElemental(int poder, int ataque, int defesa, int fator,Tipos tipo);
		
}