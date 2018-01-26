package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import Abstraction.Donnees;
import Presentation.fenetreModifier;
import Presentation.fenetrePoids;

public class controlPiece implements ItemListener{
	private Donnees donnees; 
	private JComboBox<String> pieces; 
	private int count=0;
	public controlPiece(JComboBox<String> pieces, Donnees donnes) { 
		this.donnees=donnes; 
		this.pieces=pieces; 
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {		
		this.donnees.valeurPiece = this.pieces.getSelectedIndex();
		if (count%2==0) {
			fenetrePoids fen = new fenetrePoids(this.donnees); 
			fen.setLocationRelativeTo(null);
			fen.setVisible(true);			
		}
		count++;
		this.donnees.Calcul();
	}
	

}
