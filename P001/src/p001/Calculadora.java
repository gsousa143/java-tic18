package p001;

import java.util.Scanner;

public class Calculadora {
	private double num1, num2;
	private double resultado;
	
	public Calculadora(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = 0;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getResultado() {
		return resultado;
	}

	private void soma() {
		this.resultado = this.num1 + this.num2;
	}
	private void subtracao() {
		this.resultado = this.num1-this.num2;
	}
	private void multiplicacao() {
		this.resultado = this.num1*this.num2;
	}
	private void divisao() {
		this.resultado = this.num1/this.num2;
	}
	public void menu(char op) {
		switch (op){
		case '+':
			this.soma();
			break;
		case'-':
			this.subtracao();
			break;
		case '*':
			this.multiplicacao();
			break;
		case '/':
			this.divisao();
			break;
		}
		System.out.println(this.num1+" "+op+" "+this.num2+" = "+this.resultado);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double num1, num2;
		char op;
		
		System.out.println("Digite dois numeros reais");
		num1 = s.nextDouble();
		num2 = s.nextDouble();
		Calculadora op1 = new Calculadora(num1,num2);
		
		System.out.println("Digite o caracter da operacao (+,-,*,/)");
		op = s.next().charAt(0);
		
		op1.menu(op);
		
		
	}
	
}
