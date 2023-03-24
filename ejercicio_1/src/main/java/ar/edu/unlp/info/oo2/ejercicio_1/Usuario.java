package ar.edu.unlp.info.oo2.ejercicio_1;
import java.util.*;

public class Usuario {
	
	protected String screenName;
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
	
}
