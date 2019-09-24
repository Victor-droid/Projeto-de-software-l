import java.util.Scanner;
public class Testedetriangulo {
	private static Scanner entrada;

	public static void main(String[] args) {
		int a,b,c;
		entrada = new Scanner(System.in);
		ClassificarTriangulo teste = new ClassificarTriangulo(); 
		
		System.out.println("Entre com o 1 lado");
		a = entrada.nextInt();
		System.out.println("Entre com o 2 lado");
		b = entrada.nextInt();
		System.out.println("Entre com o 3 lado");
		c = entrada.nextInt();
		
		System.out.println(teste.classificatriangulo(a, b, c));
		
		
		
	}
}
