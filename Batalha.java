public class Batalha {
    public static int batalhar(Criatura minhaCriatura, Criatura adversaria) {
        criarMensagemInicioBatalha(minhaCriatura, adversaria);
        Turno.repetirTurno(minhaCriatura, adversaria);
        return 1;
    }

    private static void criarMensagemInicioBatalha(Criatura minhaCriatura, Criatura adversaria){
        System.out.printf("Que comece a batalha entre:\n%s\tVS\t%s",minhaCriatura.mensagemCriaturaCriada(),adversaria.mensagemCriaturaCriada());
    }

    private static void criarMensagemVitoriaBatalha() {
        System.out.println("Parabéns! Você venceu a batalha!");
    }

    private static void criarMensagemDerrotaBatalha() {
        System.out.println("Que pena, você perdeu a batalha!");
    }
}
