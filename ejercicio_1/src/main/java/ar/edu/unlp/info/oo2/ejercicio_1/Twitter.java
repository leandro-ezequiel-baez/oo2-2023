package ar.edu.unlp.info.oo2.ejercicio_1;
import java.util.*;

public class Twitter {
	
	private List<Usuario> listaDeUsuarios=new LinkedList<Usuario>();
	
	
	
	public void darDeBajaUsuario(Usuario user) {
		borrarUsuario(user);
	}
	
	public void darDeAltaUsuario(Usuario user) {
		if(listaDeUsuarios.stream().map(Usuario::getScreenName).toString()==user.getScreenName()) {
			listaDeUsuarios.add(crearUsuario(user));
		}else {
			System.out.println("usuarios repetido");
		}
	}
	private Usuario crearUsuario(String screenName) {
		return (new Usuario(screenName));
	}
	
	private boolean borrarUsuario(Usuario user) {
		//toDo
		return true;
	}
}
