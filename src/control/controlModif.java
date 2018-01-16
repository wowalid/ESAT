package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Presentation.fenetreModifier;

public class controlModif implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		fenetreModifier fen = new fenetreModifier(); 
		fen.setLocationRelativeTo(null);
		fen.setVisible(true);
		
	}

}
