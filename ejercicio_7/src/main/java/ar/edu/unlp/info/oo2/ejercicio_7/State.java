package ar.edu.unlp.info.oo2.ejercicio_7;

public abstract class  State {

	protected ToDoItem tarea;
	
	
	public State(ToDoItem tarea) {
		this.tarea=tarea;
	}
	
	protected ToDoItem getTarea() {
		return tarea;
	}
	protected void setTarea(ToDoItem tarea) {
		this.tarea = tarea;
	}
	
	public abstract void start();	
	public abstract void togglePause();
	public abstract void finish();
	public abstract void addComment(String comment);
}

