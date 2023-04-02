package ar.edu.unlp.info.oo2.ejercicio_6;

public abstract class Strategy {
	private int cantidad;
	
	public abstract double basico();
	
	public abstract double adicional();
	
	public  double descuento() {
		return basico() *(0.13)+adicional()*(0.05);
	};
	
	public  double sueldo() {
		return basico()+adicional()-descuento();
	}
	
	public void setCantidad(int cant){
		this.cantidad=cant;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
}
