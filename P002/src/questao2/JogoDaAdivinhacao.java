package questao2;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
	private int resposta;
	private int chute;
	private int dica;
	private int numChutes;
	
	public JogoDaAdivinhacao(){
		Random aleatorio = new Random();
		this.resposta = aleatorio.nextInt(99)+1;
	}
	private void leChute() {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um numero inteiro entre 1 e 100");
		
		try {
			this.chute = s.nextInt();
		}
		catch (Exception e) {
			System.out.println("Digite um valor valido");
			this.leChute();
		}
		
		if (this.chute>100 || this.chute<1) {
			System.out.println("Digite um valor valido");
			this.leChute();
		}
	}
	private void comparaComResposta() {
		if(this.resposta>this.chute) {
			System.out.println("Muito baixo");
			this.dica = -1;
			return;
		}
		if(this.resposta<this.chute) {
			System.out.println("Muito alto");
			this.dica = 1;
			return;
		}
		System.out.println("Acertou mizeravi");
		this.dica = 0;
		return;
	}
	
	public void jogo() {
		do {
			this.leChute();
			this.comparaComResposta();
			this.numChutes++;
		}while(this.dica != 0);
		System.out.println("Final do jogo, conseguiu adivinhar com "+this.numChutes+" tentativas");
	}
	
	
	public static void main(String[] args) {
		JogoDaAdivinhacao novoJogo = new JogoDaAdivinhacao();
		novoJogo.jogo();
	}
}
