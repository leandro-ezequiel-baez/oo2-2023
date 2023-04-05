package ar.edu.unlp.info.oo2.ejercicio_7;

public class Finished extends State {

	public Finished() {
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
		
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComment(String comment) {
	}

}
