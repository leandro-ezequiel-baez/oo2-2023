package ar.edu.unlp.info.oo2.ejercicio_6;

public class Pasante extends TemplateMethod{

	@Override
	public double basico() {
		
		return 20000;
	}

	@Override
	public double adicional() {
		return 2000*this.getCantidad();
	}

}
