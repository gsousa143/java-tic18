package classesjava;

import java.util.Scanner;

public class Cliente {
private String nome;
private int idade;
private String cpf;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public Cliente(String nome, String cpf) {
	this.nome = nome;
	this.idade = 0;
	this.cpf = cpf;
}


public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	String nome;
	int idade = 3;
	String cpf;
	
	System.out.println("Digite o nome do cliente");
	nome = s.nextLine();
	
	System.out.println("Digite o CPF do cliente");
	cpf = s.next();
	
	Cliente cliente = new Cliente(nome,cpf);
	
	System.out.println("nome: "+cliente.getNome());
	System.out.println("idade: "+cliente.getIdade());
	System.out.println("cpf: "+cliente.getCpf());
	
	System.out.println("Altere seus dados!");
	
	System.out.println("Digite o novo nome do cliente");
	nome = s.next();
	cliente.setNome(nome);
	
	System.out.println("Digite a nova idade do cliente");
	idade = s.nextInt();
	cliente.setIdade(idade);
	
	System.out.println("Digite o novo CPF do cliente");
	cpf = s.next();
	cliente.setCpf(cpf);
	
	System.out.println("Dados alterados!");
	
	System.out.println("nome: "+cliente.getNome());
	System.out.println("idade: "+cliente.getIdade());
	System.out.println("cpf: "+cliente.getCpf());
	
	
	
}
}
