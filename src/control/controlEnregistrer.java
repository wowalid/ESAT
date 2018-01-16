package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import Presentation.fenetreModifier;

public class controlEnregistrer implements ActionListener{
	private fenetreModifier fen; 
	private JTextField f1; 
	private JTextField f2; 
	private JTextField f3; 
	
	public controlEnregistrer (fenetreModifier fen, JTextField f1, JTextField f2, JTextField f3) { 
		this.fen=fen; 
		this.f1=f1;
		this.f2=f2;
		this.f3=f3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.fen.setVisible(false);
		
		
	}
	
	

}
