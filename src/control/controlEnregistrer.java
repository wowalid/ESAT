package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Abstraction.Donnees;
import Presentation.fenetreModifier;

public class controlEnregistrer implements ActionListener{
	private fenetreModifier fen; 
	private JTextField f1;
	private JLabel j1;
	private Double valeur;
	private Donnees donnees;
	public controlEnregistrer (fenetreModifier fen, JTextField f1,JLabel j1, Donnees donnees) { 
		this.fen=fen; 
		this.f1=f1;
		this.j1 = j1;
		this.donnees = donnees;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//A modifier
		try { 		
			switch (this.j1.getText()) {
				case ("Prix élécricité en kWh") :
					if (this.f1.getText().equals("")) {
						this.donnees.prixElec=this.donnees.prixElec;
					}
					else {
						this.donnees.prixElec=Double.parseDouble(this.f1.getText()); 
						this.donnees.Calcul();
					}
				break;
				
				case ("Prix de l'eau en m3") :
					if (this.f1.getText().equals("")) {
						this.donnees.prixDelEau=this.donnees.prixDelEau;
					}
					else {
						this.donnees.prixDelEau=Double.parseDouble(this.f1.getText()); 
						this.donnees.Calcul();
					}									
				break;
				
				case ("Prix du gaz en kWh") :
					if (this.f1.getText().equals("")) {
						this.donnees.prixGaz=this.donnees.prixGaz;
					}
					else {
						this.donnees.prixGaz=Double.parseDouble(this.f1.getText()); 
						this.donnees.Calcul();
					}									
				break;
			}

			this.fen.setVisible(false);
			
		}
		catch (Exception error){ 
			JOptionPane.showMessageDialog(null, "Veuillez rentrer des valeurs correctes ou ne rien rentrer");
			this.fen.setVisible(true);
		}
		
		
		
		
	}
	
	

}
