public class Torneio {
    private Criatura minhaCriatura;
    private Criatura[] criaturasAdversarias;
    private final int NUMERO_DE_BATALHAS = 3;
    private boolean venceu = true;

    public void iniciar() {
        Menu.criarMenuPrincipal();
        int opcao = Menu.criarMenuCriaturas();
        escolherCriatura(opcao);
        Menu.criarMenuTorneio();
        iniciarBatalha();
        
    }

    private void iniciarBatalha() {
        for (int i = 0; i < NUMERO_DE_BATALHAS; i++) {
            minhaCriatura.setPontosDeVidaInicial();
        if (!venceu) {
            criarMensagemDerrota();
            System.exit(0);
        }else if (venceu && i < 3){
            venceu = Batalha.batalhar(minhaCriatura, criaturasAdversarias[i]);
        }
    }
        criarMensagemCampeao();
    }

    private void escolherCriatura(int opcao){
        switch (opcao) {
            case 1:
                minhaCriatura = new StoneDev();
                System.out.println(minhaCriatura.criarMensagemCriaturaCriada()); 
                criaturasAdversarias = minhaCriatura.criarInimigos();
                break;
            case 2:
                minhaCriatura = new WaveNerd();
                System.out.println(minhaCriatura.criarMensagemCriaturaCriada());
                criaturasAdversarias = minhaCriatura.criarInimigos();
                break;
            case 3:
                minhaCriatura = new BurnCoder();
                System.out.println(minhaCriatura.criarMensagemCriaturaCriada());
                criaturasAdversarias = minhaCriatura.criarInimigos();
                break;
            case 4:
                minhaCriatura = new BreezeHacker();
                System.out.println(minhaCriatura.criarMensagemCriaturaCriada());
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
