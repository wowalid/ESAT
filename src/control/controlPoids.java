package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class controlPoids implements ActionListener{

	public controlPoids() {
		
	}
	public void actionPerformed(ActionEvent e) {
		try {
			donnees.poidsPiece[donnees.valeurPiece] = Double.parseDouble(choisir.getText());
		}
		catch (Exception error){ 
			JOptionPane.showMessageDialog(null, "Veuillez rentrer des valeurs correctes ou ne rien rentrer");
		}
	}
}
