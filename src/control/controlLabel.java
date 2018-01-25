package control;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

import Abstraction.Donnees;

public class controlLabel implements Observer{
	public int machine; 
	public double[] resultatParMachine; 
	public JLabel label ; 
	public Donnees donnees ; 
	public JLabel mach; 
	
	public controlLabel (int machine,double[] resultatParMachine,JLabel label, Donnees donnees,JLabel mach) { 
		this.machine=machine; 
		this.resultatParMachine=resultatParMachine; 
		this.label = label; 
		this.donnees=donnees; 
		this.mach=mach;
	}

	@Override
	public void update(Observable o, Object arg) {
		if ((this.mach.getText().equals("Machine 2"))||(this.mach.getText().equals("Machine 5"))){
			if (this.donnees.boutonValeurs[1]<=10) {
				this.label.setText(""+resultatParMachine[machine]);
			}
			else { 
				this.label.setText("");
			}
		}
		else { 
			if (this.donnees.boutonValeurs[1]>=10) {
				this.label.setText(""+resultatParMachine[machine]);
			}
			else { 
				this.label.setText("");
			}
		}
		
	}

	
	
}
