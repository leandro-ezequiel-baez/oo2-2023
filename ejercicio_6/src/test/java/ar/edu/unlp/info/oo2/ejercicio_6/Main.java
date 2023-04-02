package ar.edu.unlp.info.oo2.ejercicio_6;

public class Main {
	public static void main(String args[])  //static method  
	{ 
		Strategy planta=new Planta(true, 1, 0);
		System.out.println("adicional: "+planta.adicional());
		System.out.println("basico: "+planta.basico());
		System.out.println("descuento "+planta.descuento());
		System.out.println("sueldo: "+planta.sueldo());
		
		Strategy pasante=new Pasante();
		pasante.setCantidad(4);
		System.out.println("adicional: "+pasante.adicional());
		System.out.println("basico: "+pasante.basico());
		System.out.println("descuento "+pasante.descuento());
		System.out.println("sueldo: "+pasante.sueldo());
	}
}
