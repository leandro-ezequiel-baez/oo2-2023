package ar.edu.unlp.info.oo2.ejercicio_7;

public class Paused extends State{

	public Paused() {		
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void togglePause() {
		this.getTarea().setEstado(new InProgress());
		
	}

	@Override
	public void finish() {
		this.getTarea().setEstado(new Finished());
		
	}

	

	
}
