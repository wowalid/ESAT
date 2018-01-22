package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import Abstraction.Donnees;

public class controlPiece implements ItemListener{
	private Donnees donnees; 
	private JComboBox<String> pieces; 
	
	public controlPiece(JComboBox<String> pieces, Donnees donnes) { 
		this.donnees=donnes; 
		this.pieces=pieces; 
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {		
		this.donnees.valeurPiece = this.pieces.getSelectedIndex();
		this.donnees.Calcul();
	}
	

}
