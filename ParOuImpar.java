import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero:");
		num = sc.nextInt();
		
		if(num % 2 == 0)
			System.out.println("\nNumero par");
		else
			System.out.println("\nNumero impar");
		
		
		
		
		sc.close();
	}

}
