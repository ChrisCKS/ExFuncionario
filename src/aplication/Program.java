package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Salario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Salario dados = new Salario();
		
		System.out.print("Digite seu nome: ");
		dados.nome = sc.nextLine();
		
		System.out.print("Digite seu salário: ");
		dados.salarioBruto = sc.nextDouble();
		
		System.out.printf("Salario Liquido:%.2f ", dados.salarioLiquido());
		
		System.out.println();
		
		System.out.println("Digite a taxa de aumento: ");
		Double porcentagem = sc.nextDouble();
		dados.aumento(porcentagem);
		
		System.out.println("Novo salario: " + dados);
	}
}
