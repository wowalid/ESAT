package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Abstraction.Donnees;
import Presentation.fenetreModifier;

public class controlEnregistrer implements ActionListener{
	private fenetreModifier fen; 
	private JTextField f1; 
	private JTextField f2; 
	private JTextField f3; 
	private Donnees donnees; 
	
	public controlEnregistrer (fenetreModifier fen, JTextField f1, JTextField f2, JTextField f3, Donnees donnees) { 
		this.fen=fen; 
		this.f1=f1;
		this.f2=f2;
		this.f3=f3;
		this.donnees=donnees; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//A modifier
		try { 
			if (this.f1.getText().equals("")) {
				this.donnees.prixElec=this.donnees.prixElec;
			}
			if (this.f2.getText().equals("")) {
				this.donnees.prixDelEau=this.donnees.prixDelEau;
			}
			if (this.f3.getText().equals("")) {
				this.donnees.prixGaz=this.donnees.prixGaz;
			}
			else {
				this.donnees.prixElec=Double.parseDouble(this.f1.getText()); 
				this.donnees.prixDelEau=Double.parseDouble(this.f2.getText()); 
				this.donnees.prixGaz=Double.parseDouble(this.f3.getText()); 
				this.donnees.Calcul();
			}
			this.fen.setVisible(false);
			
		}
		catch (Exception error){ 
			JOptionPane.showMessageDialog(null, "Veuillez rentrer des valeurs correctes ou ne rien rentrer");
			this.fen.setVisible(true);
		}
		
		
		
		
	}
	
	

}
