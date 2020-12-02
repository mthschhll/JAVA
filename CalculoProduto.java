import java.util.Scanner;

public class CalculoProduto {

	public static void main(String[] args) {
		
		int a, b, c, d, dif;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de A:");
		a = sc.nextInt();
		System.out.println("Valor de B:");
		b = sc.nextInt();
		System.out.println("Valor de C");
		c = sc.nextInt();
		System.out.println("Valor de D");
		d = sc.nextInt();
		
		dif = (a*b - c*d);
		
		dif = Math.abs(dif); // chamando numero absoluto
		
		System.out.printf("\nA diferenca do produto de A e B pelo produto de C e D eh: %d", dif);
		
		sc.close();
		

	}

}
