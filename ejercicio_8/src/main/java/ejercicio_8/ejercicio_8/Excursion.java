package ejercicio_8.ejercicio_8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public  class Excursion {
	private String nombre;
	private Date fInicio;
	private String encuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private State estado;
	private List<Usuario> lista;
	
	public Excursion(String nombre, Date fInicio, String encuentro, double costo, int cupoMinimo, int cupoMaximo) {
		this.nombre=nombre;
		this.fInicio=fInicio;
		this.encuentro=encuentro;
		this.costo=costo;
		this.cupoMinimo=cupoMinimo;
		this.cupoMaximo=cupoMaximo;
		this.lista=new ArrayList<Usuario>();
		this.estado=new Provisorio();
		};

	public void inscribirUsuario(Usuario user) {
		this.estado.
	}
	
	public List<Usuario> getLista() {
		return this.lista;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public State getEstado() {
		return estado;
	}
	
	
}
	

