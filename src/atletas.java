import java.util.Locale;
import java.util.Scanner;

public class atletas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		char sexo, pergunta;
		double altura, peso;
		altura = 0;
		peso = 0;
		pergunta = 0;
		//Leitura dos dados
		
		do{
				
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Sexo: ");
				sexo = sc.next().charAt(0);
				System.out.print("Altura: ");
				altura = sc.nextDouble();
					while (altura <= 0) {
						System.out.println("Digite um valor válido. ");
						System.out.print("Altura: ");
						altura = sc.nextDouble();
					}
				System.out.print("Peso: ");
				peso = sc.nextDouble();
					while (peso <= 0) {
						System.out.println("Digite um valor válido. ");
						System.out.print("Peso: ");
						peso = sc.nextDouble();
					}
				System.out.print("Digitar outro atleta? ");
				pergunta = sc.next().charAt(0);	
				sc.nextLine();
			}
		while (pergunta == 's' || pergunta == 'S' ) ;
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
