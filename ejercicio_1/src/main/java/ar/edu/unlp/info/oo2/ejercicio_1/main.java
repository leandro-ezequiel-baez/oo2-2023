package ar.edu.unlp.info.oo2.ejercicio_1;

public class main {
	public static void main(String args[])  //static method  
	{  
		Twitter twitter= new Twitter();
		Usuario user1=new Usuario("lean");
		Usuario user2=new Usuario("juan");
		
		Tweet tweet1=new Tweet("");
		Tweet tweet2=new Tweet("asdf",tweet1);
		
		user1.postear(tweet1);
		user1.postear(tweet2);
		
		twitter.darDeAltaUsuario(user1);
		//twitter.darDeAltaUsuario(user2);
		
		System.out.println(twitter.darDeBajaUsuario(user1));//true si lo borra		
		
	}
}