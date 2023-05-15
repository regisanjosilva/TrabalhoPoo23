public class Torneio {
    private Criatura minhaCriatura;
    private Criatura[] criaturasAdversarias;

    public void iniciar() {
        Menu.criarMenuPrincipal();
        int opcao = Menu.criarMenuCriaturas();
        escolherCriatura(opcao);
        Menu.criarMenuTorneio();
        iniciarBatalha();
        
    }

    private void iniciarBatalha() {
        for (int i = 0; i < 3; i++) {
            minhaCriatura.setPontosDeVidaInicial();
            boolean venceu = Batalha.batalhar(minhaCriatura, criaturasAdversarias[i]);
        if (!venceu) {
            criarMensagemDerrota();
            System.exit(0);
        }
    }
        criarMensagemCampeao();
    }

    private void escolherCriatura(int opcao){
        switch (opcao) {
            case 1:
                minhaCriatura = new StoneDev();
                minhaCriatura.mensagemCriaturaCriada();
                criaturasAdversarias = minhaCriatura.criarInimigos();
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

    public static void criarMensagemCampeao() {
        System.out.printf("\nParabéns! Você venceu o jogo!\n");
    }
    public static void criarMensagemDerrota() {
        System.out.printf("\nInicie um novo jogo para tentar novamente!\n");
    }
}
