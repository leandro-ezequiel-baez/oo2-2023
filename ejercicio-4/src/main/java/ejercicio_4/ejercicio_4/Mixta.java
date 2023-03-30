package ejercicio_4.ejercicio_4;

import java.util.ArrayList;
import java.util.List;

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
		return 1;
	};
	
	public boolean isComposite() {
		return true;
	}
}
