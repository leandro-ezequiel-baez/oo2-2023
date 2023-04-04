package ejercicio_4.ejercicio_5;

public class Archivo extends FileSystem{
	
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

}
