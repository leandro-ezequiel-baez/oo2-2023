package ejercicio_4.ejercicio_4;

import java.util.Objects;

public class Agua extends Topografia {
	public double getPorcionAgua() {
		return 1;
	};
	
	public boolean isComposite() {
		return false;
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
