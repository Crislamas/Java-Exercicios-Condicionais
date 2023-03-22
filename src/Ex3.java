
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = scan.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = scan.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		System.out.println("Média: " + media);
		System.out.println("----------------------------------------");
		
		if (media > 7.0) {
			System.out.println("Aprovado - não fez mais que sua obrigação");
		}
		else System.out.println("Reprovado - você ficará longe do PlayStation por 1 ano");
		
		scan.close();
	}

}
