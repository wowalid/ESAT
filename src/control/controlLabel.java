package control;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class controlLabel implements Observer{
	public int machine; 
	public double[] resultatParMachine; 
	public JLabel label ; 
	
	public controlLabel (int machine,double[] resultatParMachine,JLabel label) { 
		this.machine=machine; 
		this.resultatParMachine=resultatParMachine; 
		this.label = label; 
	}

	@Override
	public void update(Observable o, Object arg) {
		this.label.setText(""+resultatParMachine[machine]);
		
	}

	
	
}
