package Presentation;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.controlEnregistrer;
public class fenetreResultat extends JFrame{
	public fenetreResultat () { 
		super("Prix sur les machines"); 
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(6,1));
		JLabel message = new JLabel("Prix du process si passage par : "); 
		
		JPanel m1 = new JPanel() ; 
		m1.setLayout(new GridLayout(1,2));
		JLabel mach1= new JLabel("Machine 1");
		JLabel prix1 = new JLabel ("1") ;
		m1.add(mach1);
		m1.add(prix1);
		
		JPanel m2 = new JPanel() ; 
		m2.setLayout(new GridLayout(1,2));
		JLabel mach2= new JLabel("Machine 2");
		JLabel prix2 = new JLabel ("2") ;
		m2.add(mach2);
		m2.add(prix2);
		
		JPanel m3 = new JPanel() ; 
		m3.setLayout(new GridLayout(1,2));
		JLabel mach3= new JLabel("Machine 3");
		JLabel prix3 = new JLabel ("3") ;
		m3.add(mach3);
		m3.add(prix3);
		
		JPanel m4 = new JPanel() ; 
		m4.setLayout(new GridLayout(1,2));
		JLabel mach4= new JLabel("Machine 4");
		JLabel prix4 = new JLabel ("4") ;
		m4.add(mach4);
		m4.add(prix4);
		
		JPanel m5 = new JPanel() ; 
		m5.setLayout(new GridLayout(1,2));
		JLabel mach5= new JLabel("Machine 5");
		JLabel prix5 = new JLabel ("5") ;
		m5.add(mach5);
		m5.add(prix5);
		
		c.add(message);
		c.add(m1);
		c.add(m2);
		c.add(m3);
		c.add(m4);
		c.add(m5);
		
		this.pack(); 
		
	}
}
