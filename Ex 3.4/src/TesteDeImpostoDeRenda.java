import java.util.Scanner;
public class TesteDeImpostoDeRenda {
		private static Scanner entrada;

		public static void main(String[] args) {
			double salario;
		entrada = new Scanner(System.in);
		ImpostoDeRenda teste = new ImpostoDeRenda();
		
		System.out.println("Qual o seu salario ?");
		salario = entrada.nextInt();
		System.out.println("Porcentagem � de :");
		System.out.println(teste.Recebesalario(salario));
	
		System.out.println("Imposto anual � de : R$");
		System.out.println(teste.ImpostoAnual(salario));
		
		}
}
