package ar.edu.unlp.info.oo2.biblioteca;

public class main {
	public static void main(String args[])  //static method  
	{  
		JsonAdapter exporter=new JsonAdapter();
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setExporter(exporter);
		Socio socio1;
		Socio socio2;
		Socio socio3;
		Socio socio4;
		socio1=new Socio("leandro","mail1@hotmail.com","leagajo1");
		socio2=new Socio("marcos","mail2@hotmail.com","leagajo2");
		//socio3=new Socio("ivan","mail3@hotmail.com","leagajo3");
		//socio4=new Socio("matias","mail4@hotmail.com","leagajo4");
		
		biblioteca.agregarSocio(socio1);
		biblioteca.agregarSocio(socio2);
		System.out.println(biblioteca.exportarSocios()); 
	} 
}
