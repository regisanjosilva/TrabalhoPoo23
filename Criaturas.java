
public class Criatura {
	
	private String nome;
	private int poder;
	private int ataque;
	private int defeza;
	private int velocidade;
	private int pontoDeVida;
	
	public Criatura(String nome, int poder, int ataque, int defeza, int velocidade, int pontoDeVida) {
		this.nome = nome;
		this.poder = poder;
		this.ataque = ataque;
		this.defeza = defeza;
		this.velocidade = velocidade;
		this.pontoDeVida = pontoDeVida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public int getDefeza() {
		return defeza;
	}

	public void setDefeza(int defeza) {
		this.defeza = defeza;
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
	
	public abstract void atacar();
	
	public abstract void danos();
		

}