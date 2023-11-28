package redesocial;

import java.util.ArrayList;

public class ListaUsuarios {
	
	private ArrayList<Usuario> listaDeUsuarios;
	
	public ListaUsuarios(){
		listaDeUsuarios = new ArrayList<Usuario>();
	}

	public void criarUsuario(Usuario usuario) {
		listaDeUsuarios.add(usuario);
	}
	
	public void removerUsuario(Usuario usuario) {
		for (Usuario amigo : listaDeUsuarios) {
			usuario.removeAmizade(amigo);
		}
		listaDeUsuarios.remove(usuario);
	}
}
