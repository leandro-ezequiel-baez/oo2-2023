package ar.edu.unlp.info.oo2.ejercicio_1;
import java.util.*;

public class Usuario {
	
	private String screenName;
	private HashSet<Tweet> todosMisTweets; 
	
	//constructor
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.todosMisTweets =new HashSet<Tweet>();
	}

	
	public void postear(Tweet tweet) {
		todosMisTweets.add(tweet);
	}
	
	public void leer() {
		
	}
	
	public void eliminar() {
		
	}
	
	public String getScreenName() {
		return screenName;
	}


	@Override
	public int hashCode() {
		return Objects.hash(screenName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(screenName, other.screenName);
	}
	
	
	
}
