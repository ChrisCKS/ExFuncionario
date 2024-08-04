package entities;

public class Salario {

	public String nome;
	public double salarioBruto;
	public double taxa = 12.0/100.0;
	
	public double salarioLiquido() {
		return salarioBruto - (salarioBruto * taxa);
	}
	
	public void aumento(double porcentagem) {
		salarioBruto += (salarioBruto * porcentagem/100.0);
		}
	
	public String toString() {
		return nome + ", $" + String.format("%.2f", salarioLiquido());
}

}
