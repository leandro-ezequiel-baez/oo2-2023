package ar.edu.unlp.info.oo2.ejercicio_6;

public class Temporario extends TemplateMethod {

	private int horasExtras;
	private boolean casado;
	
	public Temporario(boolean casado,int cantHijos) {
		this.casado=casado;
		super.setCantidad(cantHijos);
	}
	
	public int getHijos() {
		return super.getCantidad();
	}
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public double basico() {
		
		return 20000+horasExtras*300;
	}

	private double casado() {
		return casado ? 5000:0;
	}
	@Override
	public double adicional() {
		
		return casado()+2000*getHijos();
	}

}
