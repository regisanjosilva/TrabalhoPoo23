	import java.util.Scanner;
	
	
	public class Jogador{
		
		
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);
			
			Jogador jogador = new Jogador();
			
			 public void iniciar(){
				this.menuPrincipal;
				this.menuCriatura;
			}
			void menuPrincipal();
			System.out.println("========Bem Vindo Ao Jogo======");
			System.out.println("Escolha uma opção");
			System.out.println(" 1) Iniciar jogo ");
			System.out.println(" 2) Sair do jogo ");
			System.out.println("===============================");
			
			int opcao = input.nextInt();
			
			switch (opcao){
				case 1: 
				menuCriaturas();
				break;
				
				case 2: 
				System.out.println("Sair do jogo");
				default:
				System.out.println("Opção invalida.tente novamente");
				menuPrincipal();
				
			
			
				System.out.println("======Selecione seu lutador=====");
				System.out.println("1 - StoneDev");
				System.out.println("2 - WaveNerd");
				System.out.println("3 - BurnCoder");
				System.out.println("4 - BreezerHacker");
				System.out.println("5 - Sair do jogo");
				
			    opcao = input.nextInt();
													
				switch (opcao){
					
					case 1: 
				System.out.println( "StoneDev");
					break;
					case 2:
					System.out.println("WaveNerd");
					break;
					case 3:
					System.out.println("BurnCoder");
					break;
					case 4:
					System.out.println("BreezerHacker");
					break;
					default:
					System.out.println("nao e uma opçao valida");
					
					
					
				}
				
			}
			
			
			
			
			
		
	
	
