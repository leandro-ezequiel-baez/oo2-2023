package ar.edu.unlp.info.oo2.ejercicio_1;
import java.text.BreakIterator;
import java.util.*;

public class Twitter {
	
	private List<Usuario> listaDeUsuarios;
	public Twitter() {
		listaDeUsuarios=new ArrayList<Usuario>();
	}
	
	
	
	//falta eliminar tweets
	public boolean darDeBajaUsuario(Usuario user) {
		if(listaDeUsuarios.isEmpty()) {
			System.out.println("lista vacia");
			return false;
		}else {
			int index =this.buscarUsuario(user);
			if(index!=-1) {
				borrarTodosSusTweets(index);
				listaDeUsuarios.remove(index);
				return true;
			}
			return false;
		
		}
	}
	
	private void borrarTodosSusTweets(int i) {
		listaDeUsuarios.get(i).getTodosMisTweets().removeAll(this.listaDeUsuarios.get(i).getTodosMisTweets());
	}
	
		
	
	private int buscarUsuario(Usuario user) {
		if(listaDeUsuarios.isEmpty()) {
			return -1;
		}else {
			return listaDeUsuarios.indexOf(user);
		}
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
