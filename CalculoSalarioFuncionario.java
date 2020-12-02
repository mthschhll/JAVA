import java.util.Scanner;

public class CalculoSalarioFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int func_num, hora;
		double salario, ValorPorHora;
		
		func_num = sc.nextInt();
		hora = sc.nextInt();
		ValorPorHora = sc.nextDouble();
		
		salario = ValorPorHora * hora;
		
		System.out.printf("Numero do funcionario: %d\nSalario %.2f\n",func_num, salario);
		
		sc.close();

	}

}
