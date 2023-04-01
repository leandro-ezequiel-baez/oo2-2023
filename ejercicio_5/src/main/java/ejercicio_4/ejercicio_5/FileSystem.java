package ejercicio_4.ejercicio_5;

import java.time.LocalDate;

public abstract  class FileSystem {
	private String name;
	private LocalDate date;
	private int size;
	
	public FileSystem(String name,int size) {
		this.name=name;
		this.date= LocalDate.now();
		this.size=size;
		
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public int getSize() {
		return size;
	};
	
	protected abstract Object laMasGrande();
	
	public abstract Archivo archivoMasNuevo() ;
	
}
