public class Torneio {
    private Criatura minhaCriatura;
    private Criatura[] criaturasAdversarias;

    public void iniciar() {
        Menu.criarMenuPrincipal();
        int opcao = Menu.criarMenuCriaturas();
        escolherCriatura(opcao);
        Menu.criarMenuTorneio();
        Batalha.batalhar(minhaCriatura, criaturasAdversarias[0]);
    }

    private void escolherCriatura(int opcao){
        switch (opcao) {
            case 1:
                minhaCriatura = new StoneDev();
                minhaCriatura.mensagemCriaturaCriada();
                System.out.println("TEste");
                criaturasAdversarias = minhaCriatura.criarInimigos();
                System.out.println("teste 2");
                break;
            case 2:
                minhaCriatura = new WaveNerd();
                minhaCriatura.mensagemCriaturaCriada();
                criaturasAdversarias = minhaCriatura.criarInimigos();
                break;
            case 3:
                minhaCriatura = new BurnCoder();
                minhaCriatura.mensagemCriaturaCriada();
                criaturasAdversarias = minhaCriatura.criarInimigos();
                break;
            case 4:
                minhaCriatura = new BreezeHacker();
                minhaCriatura.mensagemCriaturaCriada();
                criaturasAdversarias = minhaCriatura.criarInimigos();
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + opcao);
        }
    }

    public static void mensagemCampeao() {
        System.out.println("Parabéns! Você venceu o jogo!");
    }
}
