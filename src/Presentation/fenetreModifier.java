package Presentation;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.controlEnregistrer;

public class fenetreModifier extends JFrame{
	public fenetreModifier () { 
		super("Modifier"); 
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(4,1));
		
		JPanel elec = new JPanel();
		elec.setLayout(new GridLayout(1,2));
		JLabel nomElec = new JLabel("Prix élécricité en kWh");
		JTextField newElec = new JTextField() ;
		elec.add(nomElec);
		elec.add(newElec);
		
		
		JPanel eau = new JPanel();
		eau.setLayout(new GridLayout(1,2));
		JLabel nomEau = new JLabel("Prix de l'eau en m3"); 
		JTextField newEau = new JTextField() ;
		eau.add(nomEau);
		eau.add(newEau);
		
		
		JPanel gaz = new JPanel(); 
		gaz.setLayout(new GridLayout(1,2));
		JLabel nomGaz = new JLabel("Prix du gaz en kWh"); 
		JTextField newGaz = new JTextField() ;
		gaz.add(nomGaz);
		gaz.add(newGaz);
		
		c.add(elec);
		c.add(eau);
		c.add(gaz);
		
		JButton enregistrer = new JButton("Enregistrer"); 
		enregistrer.addActionListener(new controlEnregistrer(this,newElec, newEau, newGaz));
		
		c.add(enregistrer); 
		this.pack(); 
		
	}
	
}
