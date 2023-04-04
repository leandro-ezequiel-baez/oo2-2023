package ar.edu.unlp.info.oo2.ejercicio_7;

public class Pending extends State{

	public Pending(ToDoItem tarea) {
		super(tarea);
		
	}

	@Override
	public void start() {
		this.getTarea().setEstado(new InProgress (this.getTarea()));
		
	}

	@Override
	public void togglePause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComment(String comment) {
		// TODO Auto-generated method stub
		
	}

}
