import java.util.Scanner;
public class Testeaninhado {
	private static Scanner entrada;

	public static void main(String[] args) {
        int num;
        entrada = new Scanner(System.in);
        La�osaninhados teste = new La�osaninhados();
        System.out.print("Insira o valor : ");
        num = entrada.nextInt();
        teste.la�ofor(num);

    }
}

