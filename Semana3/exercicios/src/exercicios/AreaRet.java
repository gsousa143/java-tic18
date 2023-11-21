package exercicios;

public class AreaRet {
static public int calcularArea(int l1, int l2) {
	return l1*l2;
}
public static void main(String[] args) {
	int lado1 = 3;
	int lado2 = 5;
	int area = AreaRet.calcularArea(lado1, lado2);
	System.out.println(area);
}
}
