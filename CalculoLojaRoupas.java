import java.util.Scanner;

public class CalculoLojaRoupas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, num1, num2;
		double valor1, valor2, total;
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = (num1 * valor1 + num2 * valor2);
		
		System.out.printf("Valor a pagar: R$ %.2f\n", total);
		
		sc.close();
		
	}

}
