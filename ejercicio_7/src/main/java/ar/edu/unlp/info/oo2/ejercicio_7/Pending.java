package ar.edu.unlp.info.oo2.ejercicio_7;

public class Pending extends State{

	public Pending() {		
	}

	@Override
	public void start() {
		this.getTarea().setEstado(new InProgress ());
		
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
		
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}
}
