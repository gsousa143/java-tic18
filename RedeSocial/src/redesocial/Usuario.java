package redesocial;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private ArrayList<String> listaDePostagens;
	private ArrayList<Usuario> listaDeAmigos;
	private ArrayList<Sessao> listaDeSecoes;

	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		listaDePostagens = new ArrayList<String>();
		listaDeAmigos = new ArrayList<Usuario>();
		listaDeSecoes = new ArrayList<Sessao>();
	}

	public Usuario() {
		listaDePostagens = new ArrayList<String>();
		listaDeAmigos = new ArrayList<Usuario>();
		listaDeSecoes = new ArrayList<Sessao>();
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

	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<String> getListaDePostagens() {
		return listaDePostagens;
	}

	public ArrayList<Usuario> getListaDeAmigos() {
		return listaDeAmigos;
	}

	public ArrayList<Sessao> getListaDeSessoes(){
		return listaDeSecoes;
	}

	public void novaPostagem(String postagem) {
		listaDePostagens.add(postagem);
	}

	public void listaPostagens() {
		for(String postagem : listaDePostagens) {
			System.out.println(postagem);
		}
	}

	public void criarAmizade(Usuario amigo) {
		listaDeAmigos.add(amigo);
		amigo.listaDeAmigos.add(this);
	}

	public void removeAmizade(Usuario amigo) {
		listaDeAmigos.remove(amigo);
		amigo.listaDeAmigos.remove(this);
	}
	
	public boolean solicitaAutentificador(String email, String senha) {
		return ((this.email == email) && (this.senha == senha));
	}
	
	public void logar() {
		listaDeSecoes.add(new Sessao());
	}

}
