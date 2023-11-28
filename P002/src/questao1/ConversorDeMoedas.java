package questao1;

import java.util.Scanner;

public class ConversorDeMoedas {
	private double dolar;
	private double taxaDeCambio;
	
	public ConversorDeMoedas(double dolar, double taxaDeCambio) {
		super();
		this.dolar = dolar;
		this.taxaDeCambio = taxaDeCambio;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public double getTaxaDeCambio() {
		return taxaDeCambio;
	}

	public void setTaxaDeCambio(double taxaDeCambio) {
		this.taxaDeCambio = taxaDeCambio;
	}
	
	public double converteMoeda() {
		return this.dolar*this.taxaDeCambio;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o quantidade em dolar:");
		double mDolar = s.nextDouble();
		System.out.println("Digite a taxa de cambio");
		double taxa = s.nextDouble();
		ConversorDeMoedas moeda = new ConversorDeMoedas(mDolar, taxa);
		double mConvertida = moeda.converteMoeda();
		System.out.println("O valor convertido é: "+mConvertida);
		s.close();
		
	}
}
