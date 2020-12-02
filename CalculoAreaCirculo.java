import java.util.Scanner;

public class CalculoAreaCirculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			double area, raio, x = 2;
		
			raio = sc.nextDouble();
		
			raio = Math.pow(raio,  x);
		
			area = 3.14159 * raio;
		
			System.out.printf("O valor de area eh: %.4f\n", area);
		
		sc.close();
	}

}
