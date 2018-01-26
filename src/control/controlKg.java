package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Abstraction.Donnees;
import Presentation.fenetreCoutImmo;

public class controlKg implements ActionListener{

	private Donnees donnees;
	private JButton bouton;
	private fenetreCoutImmo fen;
	private JTextField label;
	public controlKg(fenetreCoutImmo fen, JButton bouton, Donnees donnees, JTextField label) {
		this.donnees = donnees;
		this.bouton = bouton;
		this.fen = fen;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			this.donnees.kg = Double.parseDouble(this.label.getText());
			this.fen.setVisible(false);
		}
		catch (Exception error){ 
			JOptionPane.showMessageDialog(null, "Veuillez rentrer des valeurs correctes ou ne rien rentrer");
			this.fen.setVisible(true);
		}
	}
	
}
