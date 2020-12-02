import java.util.Scanner;

public class CalculoProduto {

	public static void main(String[] args) {
		
		int a, b, c, d, dif;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		dif = (a*b - c*d);
		
		dif = Math.abs(dif);
		
		System.out.printf("A diferenca do produto de A e B pelo produto de C e D eh: %d", dif);
		
		sc.close();
		

	}

}
