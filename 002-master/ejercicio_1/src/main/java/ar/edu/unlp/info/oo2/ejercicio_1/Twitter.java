package ar.edu.unlp.info.oo2.ejercicio_1;
import java.util.*;

public class Twitter {
	
	private HashSet<Usuario> listaDeUsuarios=new HashSet<Usuario>(); 
	
	
	
	public void darDeBajaUsuario(Usuario user) {
		borrarUsuario(user);
	}
	
	public void darDeAltaUsuario(String screenName) {
		listaDeUsuarios.add(crearUsuario(screenName));
	}
	
	private Usuario crearUsuario(String screenName) {
		return (new Usuario(screenName));
	}
	
	private boolean borrarUsuario(Usuario user) {
		//toDo
		return true;
	}
}
