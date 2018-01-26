package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Abstraction.Donnees;
import Presentation.fenetrePoids;

public class controlPoids implements ActionListener{

	public Donnees donnees;
	public fenetrePoids fen;
	public JTextField choisir;
	
	public controlPoids(Donnees donnees, fenetrePoids fen, JTextField choisir) {
		this.donnees = donnees;
		this.fen = fen;
		this.choisir = choisir;
	}
	public void actionPerformed(ActionEvent e) {
		try {
			donnees.poidsPiece[donnees.valeurPiece] = Double.parseDouble(choisir.getText());
			JOptionPane.showMessageDialog(null, "Valeur enregistrée");
			fen.setVisible(false);
		}
		catch (Exception error){ 
			JOptionPane.showMessageDialog(null, "Veuillez rentrer des valeurs correctes ou ne rien rentrer");
		}
	}
}
