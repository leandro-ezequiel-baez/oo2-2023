package ejercicio_4.ejercicio_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends FileSystem{


	private List<FileSystem> contenido;

	public Directorio(String nombre) {
		super(nombre,32);
		contenido=new ArrayList<FileSystem>();

	}

	public Archivo laMasGrande() {
		Archivo grandote= (Archivo) this.contenido.stream().map(comp -> comp.laMasGrande()).filter(arch -> arch != null).max(Comparator.comparingInt(a -> ((Archivo) a).getSize())).orElse(null);
		return grandote;
	}

	@Override
	public Archivo archivoMasNuevo() {
		Archivo nuevo= this.contenido.stream()
				.map(fso -> fso.archivoMasNuevo())
				.filter(archivo -> archivo != null)
				.max(Comparator.comparing(a -> ((Archivo) a).getDate())) 
				.orElse(null); 
		return nuevo;
	}

	public int getSize() {
		return super.getSize()+ (this.contenido.stream().mapToInt(a -> a.getSize()).sum());
	}
}
