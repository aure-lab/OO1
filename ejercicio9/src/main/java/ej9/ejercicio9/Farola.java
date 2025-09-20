package ej9.ejercicio9;

import java.util.*;

public class Farola {
	private boolean interruptor;
	private List<Farola> farolas;
	
	public Farola () {
		this.setFarolas(new LinkedList <> ());
		this.setInterruptor(false);
	}
	
	public void pairWithNeighbor( Farola otraFarola) {
		this.addFarola(otraFarola);
		otraFarola.addFarola(this);
	}

	public boolean isOn() {
		return interruptor;
	}
	
	public boolean isOff () {
		return !interruptor;
	}

	private void setInterruptor(boolean interruptor) {
		this.interruptor = interruptor;
	}

	public List<Farola> getNeighbors() {
		return farolas;
	}

	private void setFarolas(List<Farola> farolas) {
		this.farolas = farolas;
	}
	
	public void turnOn () {
		if(this.isOff()) {
			this.setInterruptor(true);
			for (Farola far : this.getNeighbors())
				far.turnOn();
		}
	}
	
	public void turnOff () {
		if(this.isOn()) {
			this.setInterruptor(false);
			for (Farola far : this.getNeighbors())
				far.turnOff();
		}
	}
	
	private void addFarola (Farola otraFarola) {
		this.getNeighbors().add(otraFarola);
	}
	
}
