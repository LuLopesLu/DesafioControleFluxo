import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();

			Contar contar = new Contar();


			try{
				contar.contar(parametroUm, parametroDois);
				
			}catch(Exception e){
				System.out.println("Valor do primeiro número não pode ser maior que o segundo");
			}

	}		
	
	
	
	


	
    
}

