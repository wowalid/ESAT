package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Presentation.fenetreModifier;
import Presentation.fenetreResultat;

public class controlCalcul implements ActionListener{
	private fenetreResultat fen ; 
	
	public controlCalcul (fenetreResultat fen) { 
		this.fen=fen;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		fen.setLocationRelativeTo(null);
		this.fen.setVisible(true);
	}
	
	

}
