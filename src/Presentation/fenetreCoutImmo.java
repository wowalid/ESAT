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
import control.controlKg;

public class fenetreCoutImmo extends JFrame{
	private Donnees donnees;
	
	public fenetreCoutImmo (Donnees donnees) { 
		super("Cout immobilisation"); 
		this.donnees = donnees; 
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(4,1));

		JPanel kg = new JPanel();
		kg.setLayout(new GridLayout(1,3));
		JLabel nomElec = new JLabel("Nombre de kilos lavés pour cette année");
		JTextField newElec = new JTextField() ;
		kg.add(nomElec);
		kg.add(newElec);
		JButton modifierElec = new JButton("Modifier");
		modifierElec.addActionListener(new controlKg(this, modifierElec,this.donnees, newElec));
		kg.add(modifierElec);
		
		c.add(kg);
		this.pack(); 
		
	}
	
}
