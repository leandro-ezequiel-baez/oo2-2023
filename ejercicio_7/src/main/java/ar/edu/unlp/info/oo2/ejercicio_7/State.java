package ar.edu.unlp.info.oo2.ejercicio_7;

public abstract class  State {

	protected ToDoItem tarea;
	
	
	public State() {		
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
	
	public void addComment(String comment) {
		this.getTarea().setComentario(comment);
	};
}

