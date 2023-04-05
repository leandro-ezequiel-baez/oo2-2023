package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;

public class ToDoItem {
	
	private String nombre;
	private State estado;
	private String comentario;
/**
* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
*/
public ToDoItem(String name) {
	this.nombre=name;
	this.estado=new Pending();
}


/**
* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
* pending. Si se encuentra en otro estado, no hace nada.
*/
public void start() {
	estado.start();
}


/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo.
*/
public void togglePause() {
	
}
/**
* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
* in-progress o paused. Si se encuentra en otro estado, no hace nada.
*/
public void finish() {
	
}
/**
* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,* genera un error informando la causa específica del mismo.
*/


//public Duration workedTime() {

/**
* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
* contrario no hace nada."
*/
public void addComment(String comment) {
	
}
public State getEstado() {
	return estado;
}
protected void setEstado(State estado) {
	this.estado = estado;
}


public void setComentario(String comentario) {
	this.comentario = comentario;
}




}	