package ar.edu.unlp.info.oo2.ejercicio_6;

public class Planta extends Strategy{
	private int antiguedad;
	private boolean casado;
	
	public Planta(boolean casado, int antiguedad,int hijos) {
		this.antiguedad=0;
		this.casado=casado;
		this.setCantidad(antiguedad);
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	@Override
	public double basico() {
		return 50000;
	}
	
	public double casado() {
		return casado ? 5000 : 0;
	}
	
	@Override
	public double adicional() {
		
		return casado()+2000*(this.getCantidad()+this.antiguedad);
	}
	
}
