package Presentation;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Abstraction.Donnees;
import control.controlEnregistrer;

public class fenetreModifier extends JFrame{
	private Donnees donnees;
	
	public fenetreModifier (Donnees donnees) { 
		super("Modifier"); 
		this.donnees = donnees; 
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(4,1));
		
		JPanel elec = new JPanel();
		elec.setLayout(new GridLayout(1,3));
		JLabel nomElec = new JLabel("Prix élécricité en kWh");
		JTextField newElec = new JTextField() ;
		elec.add(nomElec);
		elec.add(newElec);
		JButton modifierElec = new JButton("Modifier");
		elec.addActionListener(new controlEnregistrer(this,newElec,this.donnees));
		elec.add(modifierElec);
		
		JPanel eau = new JPanel();
		eau.setLayout(new GridLayout(1,3));
		JLabel nomEau = new JLabel("Prix de l'eau en m3"); 
		JTextField newEau = new JTextField() ;
		eau.add(nomEau);
		eau.add(newEau);
		JButton modifierEau = new JButton("Modifier");
		eau.addActionListener(new controlEnregistrer(this,newEau, this.donnees));
		eau.add(modifierEau);
		
		JPanel gaz = new JPanel(); 
		gaz.setLayout(new GridLayout(1,3));
		JLabel nomGaz = new JLabel("Prix du gaz en kWh"); 
		JTextField newGaz = new JTextField() ;
		gaz.add(nomGaz);
		gaz.add(newGaz);
		JButton modifierGaz = new JButton("Modifier");
		gaz.addActionListener(new controlEnregistrer(this, newGaz,this.donnees));
		gaz.add(modifierGaz);
		
		c.add(elec);
		c.add(eau);
		c.add(gaz);
 
		this.pack(); 
		
	}
	
}
