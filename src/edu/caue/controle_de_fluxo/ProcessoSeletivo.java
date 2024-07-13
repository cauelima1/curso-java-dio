package exercicios_java_eclipse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
			boolean novamente = true;
			Scanner scan = new Scanner(System.in);
			
			try {
				while (novamente == true) {
					System.out.println("Entre com o salario do canditado: ");		
					double salarioPretendido = scan.nextDouble();
					VerificaSalario(salarioPretendido);		
					
						
					System.out.println("Deseja calcular otra vez? (s / n)");
					String escolha = scan.next();
					
					if (escolha.equals("s")) {
						novamente = true;
					}
					else { 
						novamente = false;
						System.out.println("Finalizando programa...");
					}
				}
			} catch (InputMismatchException e){
				System.out.println("Entre apenas com valores numericos !");
				
			}
	}
		
			static void VerificaSalario(double salarioPretendido) {
			
			double salarioBase = 2000.0;
				if (salarioBase > salarioPretendido)
					System.out.println("LIGAR PARA O CANDIDATO.");
				else if (salarioBase == salarioPretendido)
					System.out.println("LIGAR PARA O CANDIDADO, FAZER CONTRA PROPOSTA.");
				else 
					System.out.println("AGUARDANDO RESULTADOS DOS DEMAIS CANDIDATOS.");
		}
		
		

}
