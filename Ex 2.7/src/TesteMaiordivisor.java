
public class TesteMaiordivisor {
	
	public static void main(String[] args) {
		double numero1;
		double numero2;
    Maiordivisor entrada = new Maiordivisor();
    System.out.println("Digite um numero");
    
    numero1 = entrada.nextlnt();
 
    System.out.println("Digite outro numero");
    
    numero2 = entrada.nextlnt();
    
    System.out.println("O maior divisor eh " + entrada.mdc(numero1, numero2));
	}
}
