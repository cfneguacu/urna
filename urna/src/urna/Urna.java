package urna;

import java.util.Scanner;

public class Urna {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String lula = "Lula";
		String bolsonaro = "Bolsonaro";
		
		double contLula = 0;
		double contBolsonaro = 0;
		double contNull = 0;
		
		for(int i = 0; i>=0;i++) {
			
				System.out.println("Digite o numero do Candidato ou 0 para sair");
				int partido = entrada.nextInt();
				
				if(partido!=0) {
					
					switch(partido) {
					case 13:
					contLula++;
					break;
					case 25:
					contBolsonaro++;
					break;
					default:
					contNull++;
					break;
					}
					
				}else {
					System.out.printf("Lula %.2f%% \nBolsonaro %.2f%%  \nNulo %.2f%%  ",contLula/i*100, contBolsonaro/i*100, contNull/i*100 );
					break;
				}				
		}
		
	}
}
