package ejercicio_4.ejercicio_5;

<<<<<<< Updated upstream
public class Archivo extends FileSystem {
=======
import java.time.LocalDate;

public class Archivo extends FileSystem implements Comparable<FileSystem>{
	
	private String nombre;
	private LocalDate fecha;
	private int tamano;
>>>>>>> Stashed changes
	
	public Archivo (String name, int size) {
		super(name,size);
	}

	@Override
	protected Object laMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

	
	public boolean isComposite() {
		return false;
	}
	
	@Override
    public Archivo compareTo(FileSystem aComparar) {
		return
	}
}
