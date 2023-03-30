package ejercicio_4.ejercicio_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mixta extends Topografia{
	private List<Topografia> biomas;
	
	public Mixta(Topografia t1,Topografia t2,Topografia t3,Topografia t4) {
		biomas=new ArrayList<>();
		biomas.add(t1);
		biomas.add(t2);
		biomas.add(t3);
		biomas.add(t4);
	}
	public double getPorcionAgua() {
		double total=0;
		return biomas.stream().mapToDouble(parte->
		parte.getPorcionAgua()).sum()/4;
		
	};
	
	public boolean isComposite() {
		return true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(biomas);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mixta other = (Mixta) obj;
		return Objects.equals(this.getPorcionAgua(), other.getPorcionAgua());
	}
	
	
}
