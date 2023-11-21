package exercicios;

public class Paridade {
static public boolean verificaParidade(int num) {
	if(num%2 == 0) {
		return true;
	}
	return false;
}
public static void main(String[] args) {
	int num =  5;
	boolean ehPar = Paridade.verificaParidade(num);
	if(ehPar)
		System.out.println("par");
	else
		System.out.println("impar");
	
	
}
}
