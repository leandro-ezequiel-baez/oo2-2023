package ar.edu.unlp.info.oo2.ejercicio_1;
import java.text.BreakIterator;
import java.util.*;

public class Twitter {
	
	private List<Usuario> listaDeUsuarios;
	
	public Twitter() {
		listaDeUsuarios=new ArrayList<Usuario>();
	}
	
	public boolean darDeBajaUsuario(Usuario user) {
		if(listaDeUsuarios.isEmpty()) {
			System.out.println("lista vacia");
			return false;
		}else {
		listaDeUsuarios.stream().forEach((p)->{
			if(p.equals(user)) {
				System.out.println("esta cuenta se eliminara");
				listaDeUsuarios.remove(user);
				//eliminar tweets
				
			}
			else {
				System.out.println("no existe");
				
			}
		});return false;}
	}
	
	public void darDeAltaUsuario(Usuario user) {
		if(listaDeUsuarios.isEmpty()) {
			listaDeUsuarios.add(user);
			System.out.println("Se agrego");
		}else {
		listaDeUsuarios.stream().forEach((p)->{
			if(p.equals(user)) {
				System.out.println("repetido");
			}
			else {
				listaDeUsuarios.add(user);
				System.out.println("Se agrego");
			}
		});}
	}
}
