package ejercicio_8.ejercicio_8;

public abstract class State {
	
	protected Excursion excursion;
	
	public void State(Excursion excursion) {
		this.excursion=excursion;
	}
	
	public abstract String getInformacionDeEstado();
	
	
	public abstract boolean agregarUsuario();
	
}
