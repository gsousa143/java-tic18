package conjugador;

import java.util.Scanner;

public class Verbo {
	private String radical;
	private String sufixo;

	public String getRadical() {
		return radical;
	}

	public void setRadical(String radical) {
		this.radical = radical;
	}

	public String getSufixo() {
		return sufixo;
	}

	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}

	public Verbo(String radical, String sufixo) {
		super();
		this.radical = radical;
		this.sufixo = sufixo;
	}

	public void conjugar() {
		System.out.println("Eu " + getRadical() + "o");
		System.out.println("Tu " + getRadical() + "as");
		System.out.println("Ele " + getRadical() + "a");
		System.out.println("Nos " + getRadical() + "amos");
		System.out.println("Vos " + getRadical() + "ais");
		System.out.println("Eles " + getRadical() + "am");
		System.out.println("Verbo: " + verbo2.getRadical() + verbo2.getSufixo());
	}
	
	public void setVerbo(String verbo) {
		int tamanho = verbo.length();
		radical = verbo.substring(0,tamanho-2);
		sufixo = verbo.substring(tamanho-2);
	}
	
	public static void main(String[] args) {
		Verbo verbo = new Verbo("Program","ar");
		verbo.conjugar();
		
		String _radical;
		String _sufixo;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o radical");
		_radical = ler.nextLine();
		System.out.println("Digite o sufixo");
		_sufixo = ler.nextLine();
		Verbo verbo2 = new Verbo(_radical,_sufixo);
		verbo2.conjugar();
		
		String novoVerbo;
		//como iniciar sem o construtor???
		Verbo verbo3 = new Verbo("aaaa", "er");
		verbo3.setVerbo(novoVerbo);
		verbo3.conjugar();
		
		
	}
}
