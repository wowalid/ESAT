package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Abstraction.Donnees;
import Presentation.fenetreCoutImmo;
import Presentation.fenetreModifier;

public class controlImmo implements ActionListener{
	private Donnees donnees ;
	
	public controlImmo(Donnees donnees) { 
		this.donnees= donnees; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		fenetreCoutImmo fen = new fenetreCoutImmo(this.donnees); 
		fen.setLocationRelativeTo(null);
		fen.setVisible(true);
		
	}

}
