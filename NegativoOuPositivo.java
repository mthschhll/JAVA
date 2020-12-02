import java.util.Scanner;

public class NegativoOuPositivo {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	System.out.println("Digite um numero:");
	num = sc.nextInt();
	
	if (num >= 0)
		System.out.println("\nNumero positivo!");
	else
		System.out.println("\nNumero negativo!");
	
	sc.close();
	}

}
