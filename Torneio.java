import java.util.ArrayList;

public class Torneio {
    public void iniciar() {
        Menus.criarMenuPrincipal();
        int opcao = Menus.criarMenuCriaturas();
        Criatura minhaCriatura;
        Criatura[] criaturasAdversarias;

        switch (opcao) {
            case 1:
                minhaCriatura = new StoneDev();
                criaturasAdversarias = minhaCriatura.criarInimigos();
                break;
            case 2:
                minhaCriatura = new WaveNerd();
                criaturasAdversarias = minhaCriatura.criarInimigos();
                break;
            case 3:
                minhaCriatura = new BurnCoder();
                criaturasAdversarias = minhaCriatura.criarInimigos();
                break;
            case 4:
                minhaCriatura = new BreezeHacker();
                criaturasAdversarias = minhaCriatura.criarInimigos();
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + opcao);
        }

        Menus.criarMenuTorneio();
        Batalha.batalhar(minhaCriatura, criaturasAdversarias[0]);
    }

    public static void mensagemCampeao() {
        System.out.println("Parabéns! Você venceu o jogo!");
    }
}
