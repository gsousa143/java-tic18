package exercicios;

public class Media {
	public static double calculaMedia(double n1,double n2,double n3,double p1,double p2,double p3) {
		double media = (n1+n2+n3)/(p1+p2+p3);
		return media;
	}
	public static void main(String[] args) {
		double nota1 = 2.0, nota2 = 7, nota3 = 10;
		double peso1 = 1.0, peso2 = 1.5, peso3 = 2;
		double media;
		media = Media.calculaMedia(nota1, nota2, nota3, peso1, peso2, peso3);
		System.out.println(media);
	}
	
}
