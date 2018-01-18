package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import Abstraction.Donnees;

public class controlJCombo1 implements ItemListener{
	private Donnees donnees; 
	private JComboBox<Integer> programme; 
	private JComboBox<Integer> sechoir; 
	private int i; 
	
	public controlJCombo1(JComboBox<Integer> programme, JComboBox<Integer> sechoir, Donnees donnes, int i ) { 
		this.donnees=donnes; 
		this.programme=programme; 
		this.sechoir=sechoir; 
		this.i=i; 
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
			
		if (i==0) { 
			this.donnees.boutonValeurs[1]= this.programme.getSelectedIndex()+1; 
			this.donnees.Calcul();
		}
		else { 
			this.donnees.boutonValeurs[3]= this.sechoir.getSelectedIndex(); 
			this.donnees.Calcul();
		}
	}
	

}
