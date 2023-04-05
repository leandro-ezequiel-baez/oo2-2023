package ar.edu.unlp.info.oo2.ejercicio_7;

public class InProgress extends State{

	public InProgress() {
		
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void togglePause() {
		this.getTarea().setEstado(new Paused());
		
	}

	@Override
	public void finish() {
		this.getTarea().setEstado(new Finished());
	}
}
