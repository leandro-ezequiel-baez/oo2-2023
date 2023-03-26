package ar.edu.unlp.info.oo2.ejercicio_1;

public class main {
	public static void main(String args[])  //static method  
	{  
		Twitter twitter= new Twitter();
		Usuario user1=new Usuario("lean");
		Usuario user2=new Usuario("lean");
		
		twitter.darDeBajaUsuario(user1);
		
		twitter.darDeAltaUsuario(user1);
		twitter.darDeAltaUsuario(user2);
		
		twitter.darDeBajaUsuario(user1);		
		
	}
}