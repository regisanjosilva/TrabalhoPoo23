import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static int criarMenuPrincipal() {
        System.out.println("========Bem Vindo Ao Jogo======");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Iniciar jogo ");
        System.out.println("2 - Sair do jogo ");
        System.out.println("===============================");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
            break;
            case 2:
                sair();
                return criarMenuPrincipal();
            default:
                System.out.println("Opção inválida.Tente novamente!");
                return criarMenuPrincipal();
        }
        return opcao;
    }

    public static int criarMenuCriaturas() {

        System.out.println("======Selecione seu lutador=====");
        System.out.println("1 - StoneDev");
        System.out.println("2 - WaveNerd");
        System.out.println("3 - BurnCoder");
        System.out.println("4 - BreezerHacker");
        System.out.println("5 - Sair do jogo");
        System.out.println("===============================");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                sair();
                return criarMenuCriaturas();
            default:
                System.out.println("Não é uma opção válida. Tente novamente!");
                return criarMenuCriaturas();
        }
        
        return opcao;
    }

    public static int criarMenuTorneio() {
        System.out.println("===============================");
        System.out.println("1 - Iniciar Torneio");
        System.out.println("2 - Sair do jogo");
        System.out.println("===============================");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                break;
            case 2:
                sair();
                return criarMenuTorneio();
            default:
                System.out.println("Não é uma opção válida. Tente novamente!");
                return criarMenuTorneio();
        }
        return opcao;
    }

    public static int criarMenuAtaque() {
        System.out.println("===============================");
        System.out.println("1 - Realizar um ataque físico");
        System.out.println("2 - Realizar um ataque elemental");
        System.out.println("3 - Sair do jogo");
        System.out.println("===============================");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                sair();
                return criarMenuAtaque();

            default:
                System.out.println("Não é uma opção válida. Tente novamente!");
                return criarMenuAtaque();

        }
        return opcao;
    }

    public static int criarMenuIniciarNovaBatalha() {
        System.out.println("===============================");
        System.out.println("1 - Iniciar nova batalha");
        System.out.println("2 - Sair do jogo");
        System.out.println("===============================");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                break;
            case 2:
                sair();
                return criarMenuIniciarNovaBatalha();

            default:
                System.out.println("Não é uma opção válida. Tente novamente!");
                return criarMenuIniciarNovaBatalha();

        }
        return opcao;
    }

    private static void sair() {
        System.out.printf("Você tem certeza que quer sair do jogo?\n1 - Sim\n2 - Não\n");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                System.exit(0);
            case 2:
                break;
            default:
                System.out.println("Não é uma opção válida. Tente novamente!");
                sair();
                break;
        }
    }
}