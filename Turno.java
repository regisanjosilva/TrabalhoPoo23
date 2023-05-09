public class Turno{
	public static boolean repetirTurno(Criatura minhaCriatura,Criatura adversaria) {
		do {
			//if ()
			int opcao = Menus.menuCombate();
			switch (opcao) {
			case 1:
				adversaria.levarAtaque(adversaria, minhaCriatura);
				break;
			case 2:
				adversaria.levarAtaqueElemental(minhaCriatura);
				break;
			}
		}while(minhaCriatura.getPontoDeVida() > 0 || adversaria.getPontoDeVida() > 0);
	}
	return true;
}


