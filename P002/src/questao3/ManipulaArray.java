package questao3;

import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
	private int[] array;
	private int tamanho;
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void digitaTamanho() {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o tamanho do array:");
		try {
			this.tamanho = s.nextInt();
		}
		catch (Exception e){
			System.out.println("Valor invalido");
		}
		if (tamanho<1) {
			System.out.println("Valor invalido");
			this.digitaTamanho();
		}
	}
	
	public void criaArrayUsuario() {
		Scanner s = new Scanner(System.in);
		array = new int[tamanho];
		System.out.println("Digite os inteiros que compoem o array: ");
		for (int i =0;i<this.tamanho;i++) {
			System.out.println("Elemento "+(i+1));
			try {
				array[i] = s.nextInt();
			}
			catch (Exception e) {
				System.out.println("Valor invalido");
				break;
			}
		}
	}
	
	public void criaArrayAleatorio() {
		array = new int[tamanho];
		Random aleatorio = new Random();
		
		for(int i=0;i<this.tamanho;i++) {
			array[i] = aleatorio.nextInt(100);
		}
	}
	
	public int calculaSoma() {
		int soma = 0;
		for(int elemento: array) {
			soma += elemento;
		}
		return soma;
	}
	
	public int encontraMaior() {
		int maior = array[0];
		for (int elemento: array) {
			if(elemento>maior) {
				maior = elemento;
			}
		}
		return maior;
	}
	
	public int encontraMenor() {
		int menor = array[0];
		for(int elemento: array) {
			if(elemento<menor) {
				menor = elemento;
			}
		}
		return menor;
	}
	
	public void imprimeArray() {
		System.out.print("Array = ");
		for(int elemento: this.array) {
			System.out.print(elemento+", ");
		}
		System.out.println("");
	}
	
	
	public static void main(String[] args) {
		ManipulaArray arrayUsu = new ManipulaArray();
		ManipulaArray arrayRand = new ManipulaArray();
		
		arrayUsu.digitaTamanho();
		arrayUsu.criaArrayUsuario();
		arrayUsu.imprimeArray();
		System.out.println("A soma dos elementos do array é: "+arrayUsu.calculaSoma());
		System.out.println("O maior valor do array é: "+arrayUsu.encontraMaior());
		System.out.println("O menor valor do array é: "+arrayUsu.encontraMenor());
		
		arrayRand.setTamanho( arrayUsu.getTamanho() );
		arrayRand.criaArrayAleatorio();
		arrayRand.imprimeArray();
		System.out.println("A soma dos elementos do array é: "+arrayRand.calculaSoma());
		System.out.println("O maior valor do array é: "+arrayRand.encontraMaior());
		System.out.println("O menor valor do array é: "+arrayRand.encontraMenor());
		
		
	}

}
