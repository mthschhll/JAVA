import java.util.Scanner;

public class CalculoSalarioFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int func_num, hora;
		double salario, ValorPorHora;
		
		System.out.println("Numero do Funcionario:");
		func_num = sc.nextInt();
		System.out.println("Quantidade de hora(s) trabalhada(s)");
		hora = sc.nextInt();
		System.out.println("Valor por Hora");
		ValorPorHora = sc.nextDouble();
		
		salario = ValorPorHora * hora;
		
		System.out.printf("\nNumero do funcionario: %d\nSalario %.2f\n",func_num, salario);
		
		sc.close();

	}

}
