package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class MaiorDeIdade {
	static public boolean verificaIdade(int idade) {
		return idade>=18;
	}
	static public boolean verificaNascimento(int mesNas, int anoNas, int mesAt, int anoAt) {
	LocalDate diff = LocalDate.of(anoAt,mesAt,1).minusMonths(mesNas).minusYears(anoNas);
	return diff.getYear()>=18;
	}
	public static void main(String[] args) {	
	int idade;
	Scanner s = new Scanner(System.in);
	System.out.println("Digite a sua idade");
	idade = s.nextInt();
	if(MaiorDeIdade.verificaIdade(idade))
		System.out.println("maior de idade");
	else
		System.out.println("menor de idade");
	
	System.out.println("digite sua data de nascimento, mes e ano");
	int mesNas = s.nextInt();
	int anoNas = s.nextInt();
	System.out.println("digite o mes e ano atual");
	int mesAtual = s.nextInt();
	int anoAtual = s.nextInt();
	if(MaiorDeIdade.verificaNascimento(mesNas,anoNas,mesAtual,anoAtual))
		System.out.println("maior de idade");
	else
		System.out.println("menor de idade");
	}
}