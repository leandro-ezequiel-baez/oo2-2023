package ejercicio_4.ejercicio_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem{
	
	 private List<FileSystem> contenido;
	 private static int tamano=32;
	 private String nombre;
	 private LocalDate fecha;
	
	 public Directorio(String nombre, LocalDate fecha) {
		 contenido=new ArrayList<FileSystem>();
		 this.nombre=nombre;
		 this.fecha=fecha;
	 }
	 
	 //toDo
	 public int tamanoTotalOcupado() {
		 return contenido.stream().mapToInt(actual->
		 actual.getTamano()).sum();
	 }
	 
	 /**
	 * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	 * filesystem contenido por directorio receptor
	 */
	 public Archivo archivoMasGrande(){
		 getTamano();
	 }
	 
	 /**
	 * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	 * del filesystem contenido por directorio receptor.
	 */
	 public Archivo archivoMasNuevo() {
	        	 
	 }
	 
	 public boolean isComposite() {
		 return true;
	 }

	public int getTamano() {
		return tamano;
	}
	 
	 
}
