package control;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JCheckBox;




public class controlCheckBox implements ItemListener{

	private int lig;
	private ArrayList<JCheckBox> checkboxs;
	private int[] boutonValeurs; 
	private int i; 
	
	public controlCheckBox(ArrayList<JCheckBox> checkboxs, int lig, int[] boutonValeurs, int i ) {
		this.lig = lig;
		this.checkboxs=checkboxs; 
		this.boutonValeurs=boutonValeurs; 
		this.i=i; 
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		if (checkboxs.get(i).isSelected()) {
			System.out.println("ok");
			this.boutonValeurs[lig]= 1; 
		}
		else {		
			this.boutonValeurs[lig]=0; 
		}
	}


}
