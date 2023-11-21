package exercicios;

public class ConcString {
static public String catString(String s1, String s2) {
	return s1+s2;
}
public static void main(String[] args) {
	String s1 = "residencia ";
	String s2 = "tic18";
	String stringConc = catString(s1,s2);
	System.out.println(stringConc);
}
}
