package exercicios;

public class Soma {
	public static int somaInt(int num1,int num2) {
		int res = num1+num2;
		return res;
	}
	public static void main(String[] args) {
		int resultado;
		int num1 = 1;
		int num2 = 3;
		resultado = Soma.somaInt(num1, num2);
		System.out.println(resultado);
	}
}
