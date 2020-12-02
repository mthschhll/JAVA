import java.util.Scanner;

public class CalculoLojaRoupas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, num1, num2;
		double valor1, valor2, total;
		
		System.out.println("Diigite o codigo da primeira peca: ");
		cod1 = sc.nextInt();
		
		System.out.println("Diigite a quantidade: ");
		num1 = sc.nextInt();
		
		System.out.println("Diigite o valor: ");
		valor1 = sc.nextDouble();
		
		System.out.println("Diigite o codigo da segunda peca: ");
		cod2 = sc.nextInt();
		
		System.out.println("Diigite a quantidadea: ");
		num2 = sc.nextInt();
		
		System.out.println("Diigite o valor: ");
		valor2 = sc.nextDouble();
		
		System.out.println("\n---------------------------------\n");
		
		total = (num1 * valor1 + num2 * valor2);
		
		System.out.printf("Valor a pagar: R$ %.2f\n", total);
		
		sc.close();
		
	}

}
