package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Abstraction.Donnees;
import Presentation.fenetreModifier;

public class controlModif implements ActionListener{
	private Donnees donnees ;
	
	public controlModif(Donnees donnees) { 
		this.donnees= donnees; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		fenetreModifier fen = new fenetreModifier(this.donnees); 
		fen.setLocationRelativeTo(null);
		fen.setVisible(true);
		
	}

}
