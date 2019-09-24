import java.util.Scanner;
public class NomeDosDigitos {
	private static Scanner entrada;

	public static void main(String[] args) {
	entrada = new Scanner(System.in);
	int valor;
	int digito1,digito2,digito3,digito4,digito5;
	int resto1,resto2,resto3,resto4;
	String[] unidade;
	
	unidade = new String[10];
	unidade[0] = "zero";
    unidade[1] = "um";
    unidade[2] = "dois";
    unidade[3] = "três";
    unidade[4] = "quatro";
    unidade[5] = "cinco";
    unidade[6] = "seis";
    unidade[7] = "sete";
    unidade[8] = "oito";
    unidade[9] = "nove";

	
	System.out.println("Digite um número de 5 digitos : ");
	valor = entrada.nextInt();
	
	digito1 =  valor /10000;
	resto1  =  valor %10000;
	digito2 =  resto1 /1000;
	resto2  =  resto1 %1000;
	digito3 =  resto2 /100;
	resto3  =  resto2 % 100;
	digito4 =  resto3/10;
	resto4  =  resto3 % 10;
	digito5 =  resto4;
	
	 if  (digito1 == 1)
	        System.out.println(unidade[1]);
	    else if (digito1 == 2)
	        System.out.println(unidade[2]);
	    else if (digito1 == 3)
	        System.out.println(unidade[3]);
	    else if (digito1 == 4)
	        System.out.println(unidade[4]);
	    else if (digito1 == 5)
	        System.out.println(unidade[5]);
	    else if (digito1 == 6)
	        System.out.println(unidade[6]);
	    else if (digito1 == 7)
	        System.out.println(unidade[7]);
	    else if (digito1 == 8)
	        System.out.println(unidade[8]);
	    else if (digito1 == 9)
	        System.out.println(unidade[9]);
	    else if (digito1 == 0)
	        System.out.println(unidade[0]);
	    System.out.println(",");
	    
	    if  (digito2 == 1)
	        System.out.println(unidade[1]);
	    else if (digito2 == 2)
	        System.out.println(unidade[2]);
	    else if (digito2 == 3)
	        System.out.println(unidade[3]);
	    else if (digito2 == 4)
	        System.out.println(unidade[4]);
	    else if (digito2 == 5)
	        System.out.println(unidade[5]);
	    else if (digito2 == 6)
	        System.out.println(unidade[6]);
	    else if (digito2 == 7)
	        System.out.println(unidade[7]);
	    else if (digito2 == 8)
	        System.out.println(unidade[8]);
	    else if (digito2 == 9)
	        System.out.println(unidade[9]);
	    else if (digito2 == 0)
	        System.out.println(unidade[0]);
	    System.out.println(",");
	    
	    if  (digito3 == 1)
	        System.out.println(unidade[1]);
	    else if (digito3 == 2)
	        System.out.println(unidade[2]);
	    else if (digito3 == 3)
	        System.out.println(unidade[3]);
	    else if (digito3 == 4)
	        System.out.println(unidade[4]);
	    else if (digito3 == 5)
	        System.out.println(unidade[5]);
	    else if (digito3 == 6)
	        System.out.println(unidade[6]);
	    else if (digito3 == 7)
	        System.out.println(unidade[7]);
	    else if (digito3 == 8)
	        System.out.println(unidade[8]);
	    else if (digito3 == 9)
	        System.out.println(unidade[9]);
	    else if (digito3 == 0)
	        System.out.println(unidade[0]);
	    System.out.println(",");
	    
	    if  (digito4 == 1)
	        System.out.println(unidade[1]);
	    else if (digito4 == 2)
	        System.out.println(unidade[2]);
	    else if (digito4 == 3)
	        System.out.println(unidade[3]);
	    else if (digito4 == 4)
	        System.out.println(unidade[4]);
	    else if (digito4 == 5)
	        System.out.println(unidade[5]);
	    else if (digito4 == 6)
	        System.out.println(unidade[6]);
	    else if (digito4 == 7)
	        System.out.println(unidade[7]);
	    else if (digito4 == 8)
	        System.out.println(unidade[8]);
	    else if (digito4 == 9)
	        System.out.println(unidade[9]);
	    else if (digito4 == 0)
	        System.out.println(unidade[0]);
	    System.out.println(",");
	    
	    if  (digito5 == 1)
	        System.out.println(unidade[1]);
	    else if (digito5 == 2)
	        System.out.println(unidade[2]);
	    else if (digito5 == 3)
	        System.out.println(unidade[3]);
	    else if (digito5 == 4)
	        System.out.println(unidade[4]);
	    else if (digito5 == 5)
	        System.out.println(unidade[5]);
	    else if (digito5 == 6)
	        System.out.println(unidade[6]);
	    else if (digito5 == 7)
	        System.out.println(unidade[7]);
	    else if (digito5 == 8)
	        System.out.println(unidade[8]);
	    else if (digito5 == 9)
	        System.out.println(unidade[9]);
	    else if (digito5 == 0)
	        System.out.println(unidade[0]);
	
	}

	
	
}
