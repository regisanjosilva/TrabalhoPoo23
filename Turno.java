import java.util.Random;

public class Turno {
    private static boolean estaVivo = true;
    public static boolean repetirTurno(Criatura minhaCriatura, Criatura adversaria) {
        if (minhaCriatura.getVelocidade() >= adversaria.getVelocidade()) {
			if (minhaCriatura.getPontoDeVida() > 0 || adversaria.getPontoDeVida() > 0) {
                fazerAtaque(minhaCriatura, adversaria);
            }
			// realiza a batalha com o jogador começando até algum morrer
		} else {
			if (minhaCriatura.getPontoDeVida() > 0 || adversaria.getPontoDeVida() > 0) {
                receberAtaque(minhaCriatura, adversaria);
            }
			// realiza a batalha com a máq. começando até algum morrer
		}
        if (minhaCriatura.getPontoDeVida() > 0) {
            return estaVivo;
        }else{
            estaVivo = false;
            return estaVivo;
        }
	}

	// Escolhe o tipo do ataque (elem. ou normal) e ataca a máq.

	public static void fazerAtaque(Criatura minhaCriatura, Criatura adversaria) {
		int opcao = Menu.criarMenuAtaque();
		switch (opcao) {
		case 1:
            minhaCriatura.criarMensagemDeAtaqueFisico();
			adversaria.levarAtaqueFisico(minhaCriatura, adversaria);
            mostrarDanoRecebido(minhaCriatura, adversaria);
			break;
		case 2:
            minhaCriatura.criarMensagemDeAtaqueElemental();
			adversaria.levarAtaqueElemental(minhaCriatura, adversaria);
            mostrarDanoRecebido(minhaCriatura, adversaria);
			break;
		}
		if (adversaria.getPontoDeVida() > 0) {
			receberAtaque(minhaCriatura, adversaria);
		} //confere se o adversário morreu, caso contrario, recebe o ataque
	}

	// A máq. escolhe o tp de ataque e ataca o jogador
	
	public static void receberAtaque(Criatura minhaCriatura, Criatura adversaria) {
		final Random random = new Random();
		switch (1 + random.nextInt(2)) {
		case 1:
            adversaria.criarMensagemDeAtaqueFisico();
			minhaCriatura.levarAtaqueFisico(adversaria, minhaCriatura);
            mostrarDanoRecebido(adversaria, minhaCriatura);
			break;
		case 2:
            adversaria.criarMensagemDeAtaqueElemental();
			minhaCriatura.levarAtaqueElemental(adversaria, minhaCriatura);
            mostrarDanoRecebido(adversaria, minhaCriatura);
			break;
		}
		if (minhaCriatura.getPontoDeVida() > 0) {
			fazerAtaque(minhaCriatura, adversaria);
		} //confere se o adversário morreu, caso contrario, recebe o ataque
	}
    private static void mostrarDanoRecebido(Criatura minhaCriatura, Criatura adversaria) {
        System.out.printf("\n%s atacou %s deixando ela com %d de vida!\n",minhaCriatura.getNome(),adversaria.getNome(),adversaria.getPontoDeVida());
    }
}


