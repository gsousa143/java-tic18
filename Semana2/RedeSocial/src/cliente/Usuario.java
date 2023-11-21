package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
private String nome;
private String email;
private String nacionalidade;
private int quantidadePostagens;
private int pontuacao;
private ArrayList<String> postagens;

public Usuario() {
	nome = "sem nome";
	email = "sem email";
	nacionalidade = "sem nacionalidade";
	postagens = new ArrayList<String>();
	quantidadePostagens = 0;
	pontuacao = 0;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getNacionalidade() {
	return nacionalidade;
}

public void setNacionalidade(String nacionalidade) {
	this.nacionalidade = nacionalidade;
}


public int getQuantidadePostagens() {
	return quantidadePostagens;
}

public void setQuantidadePostagens(int quantidadePostagens) {
	this.quantidadePostagens = quantidadePostagens;
}

public int getPontuacao() {
	return pontuacao;
}

public void setPontuacao(int pontuacao) {
	this.pontuacao = pontuacao;
}

public void adicionaPostagem(String postagem) {
	quantidadePostagens += 1;
	
}

public void alteraPontuacao(int delta) {
	pontuacao += delta;
}


public static void main(String[] args) {
	String nome;
	String email;
	String nacionalidade;
	String postagem;
	Scanner s = new Scanner(System.in);
	Usuario usu = new Usuario();
	
	
	System.out.println("digite o nome do usuario");
	nome = s.next();
	usu.setNome(nome);
	
	System.out.println("digite o email do usuario");
	email = s.next();
	usu.setEmail(email);
	
	System.out.println("digite a nacionalidade do usuario");
	nacionalidade = s.next();
	usu.setNacionalidade(nacionalidade);
	
	System.out.println("nome: "+usu.getNome());
	System.out.println("email: "+usu.getEmail());
	System.out.println("nacionalidade: "+usu.getNacionalidade());
	
	
	
	System.out.println("Digite uma postagem");
	postagem = s.next();
	usu.adicionaPostagem(postagem);
	
	System.out.print("Quantidade de postagens:");
	System.out.println(usu.getQuantidadePostagens());
	
	int delta;
	System.out.println("Digite um delta para alterar a pontuacao");
	delta = s.nextInt();
	
	usu.alteraPontuacao(delta);
	
	System.out.print("Pontuacao Atual: ");
	System.out.println(usu.getPontuacao());
	

}
}
