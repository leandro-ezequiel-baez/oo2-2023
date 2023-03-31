package ejercicio_4.ejercicio_5;

import java.time.LocalDate;

public class Archivo {
	
	private String nombre;
	private LocalDate fecha;
	private int tamano;
	
	public Archivo (String nombre, LocalDate fecha, int tamano) {
		this.nombre=nombre;
		this.fecha=fecha;
		this.tamano=tamano;
	}

	public int getTamano() {
		return tamano;
	}
	
	
}
