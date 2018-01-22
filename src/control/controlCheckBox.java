package control;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JCheckBox;

import Abstraction.Donnees;




public class controlCheckBox implements ItemListener{

	private int lig;
	private ArrayList<JCheckBox> checkboxs;
	private int[] boutonValeurs; 
	private int i; 
	private Donnees donnees; 
	
	public controlCheckBox(ArrayList<JCheckBox> checkboxs, int lig, int[] boutonValeurs, int i, Donnees donnees) {
		this.lig = lig;
		this.checkboxs=checkboxs; 
		this.boutonValeurs=boutonValeurs; 
		this.i=i; 
		this.donnees=donnees; 
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		if (checkboxs.get(i).isSelected()) {
			this.boutonValeurs[lig]= 1; 
			this.donnees.Calcul();
		}
		else {		
			this.boutonValeurs[lig]=0; 
			this.donnees.Calcul();
		}
	}


}
