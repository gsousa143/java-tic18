package exercicios;

public class CalculosEstatisticos {
static public int fatorial(int x) {
	int fat=1;
	for(int i=1;i<=x;i++)
		fat*=i;
	return fat;
}
static public int arranjo(int n,int p) {
	return CalculosEstatisticos.fatorial(n)/CalculosEstatisticos.fatorial(n-p);
}
static public int combinacao(int n, int p) {
	return CalculosEstatisticos.arranjo(n, p)/CalculosEstatisticos.fatorial(p);
}
public static void main(String[] args) {
	int n = 5;
	int p = 5;
	int fat = CalculosEstatisticos.fatorial(n);
	System.out.println(n+"! = "+fat);
	int a = CalculosEstatisticos.arranjo(n, p);
	System.out.println("A_"+n+","+p+ " = "+a);
	int c = CalculosEstatisticos.combinacao(n, p);
	System.out.println("C_"+n+","+p+ " = "+c);
	
}
}
