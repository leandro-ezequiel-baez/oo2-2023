package ar.edu.unlp.info.oo2.ejercicio_1;

public class Tweet {

	private String cuerpo;
	private Tweet tweetReferencia;
	
	
	
	public Tweet(String cuerpo,Tweet tweetDeReferencia) {
		this.cuerpo=cuerpo;
		this.tweetReferencia=tweetDeReferencia;
	}
	
	public Tweet(String cuerpo) {
		if(cuerpo.length()>0 && cuerpo.length()<281) {
			this.cuerpo=cuerpo;
			this.tweetReferencia=this;
		}
		else {
			System.out.println("no se pudo crear el tweet");
		}
	}
	
	
	
}
