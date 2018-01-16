package Presentation;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Abstraction.Excel;
import control.controlCopy;


public class MainWindow extends JFrame{
	
	private Excel excel;
	
	public MainWindow () { 
		super("ESAT"); 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// partie Abstraction :
		
		excel = new Excel("lib"+File.separator+"statss.xlsx", "mal 1");
		
		Container c = this.getContentPane(); 
		c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
	
		JMenuBar menu = new JMenuBar(); 
		JMenu copy2 = new JMenu("Copyright");
		JMenuItem copy3 = new JMenuItem("Afficher");
		copy3.addActionListener(new controlCopy());
		copy2.add(copy3);
		menu.add(copy2); 
		this.setJMenuBar(menu);
		JPanel choix = new JPanel(); 
		choix.setLayout(new GridLayout(2,13));
		
		
		
		JCheckBox check = new JCheckBox("Tri"); 
		Integer[] prog = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24}; 
		JComboBox<Integer> lavage = new JComboBox<Integer>(prog);
		JLabel NomProg = new JLabel("Programme");
		JPanel programme = new JPanel(); 
		programme.setLayout(new BorderLayout());
		programme.add(NomProg,BorderLayout.WEST);
		programme.add(lavage,BorderLayout.CENTER);
		
		Integer[] mach = {1,2,3,4,5}; 
		JComboBox<Integer> machine = new JComboBox<Integer>(mach);
		JLabel NomMachine = new JLabel("Machine");
		JPanel mac = new JPanel(); 
		mac.setLayout(new BorderLayout());
		mac.add(NomMachine,BorderLayout.WEST);
		mac.add(machine,BorderLayout.CENTER);
		
		JCheckBox presech = new JCheckBox("Préséchage"); 
		
		Integer[] sech = {0,1,2,3}; 
		JComboBox<Integer> sechoir = new JComboBox<Integer>(sech);
		JLabel NomSech = new JLabel("Sechage");
		JPanel sec = new JPanel(); 
		sec.setLayout(new BorderLayout());
		sec.add(NomSech,BorderLayout.WEST);
		sec.add(sechoir,BorderLayout.CENTER);
		
		JCheckBox calandre = new JCheckBox("Calandre"); 
		
		JCheckBox defroissage = new JCheckBox("Défroissage"); 
		
		JCheckBox repassage = new JCheckBox("Repassage"); 
		
		JCheckBox cintre = new JCheckBox("Mise sur cintre"); 
		
		JCheckBox pliage = new JCheckBox("Pliage"); 
		
		JCheckBox emballage = new JCheckBox("Emballage"); 
		
		
		
		choix.add(check);
		choix.add(mac); 
		choix.add(programme);
		choix.add(presech);
		choix.add(sec);
		choix.add(calandre);
		choix.add(defroissage);
		choix.add(repassage);
		choix.add(cintre);
		choix.add(pliage);
		choix.add(emballage);
		
		c.add(choix); 
		JPanel resul = new JPanel();
		resul.setLayout(new GridLayout(1,2));
		
		JButton calculer = new JButton("Calcul");
		resul.add(calculer); 
		JLabel resultat = new JLabel("bite"); 
		resultat.setHorizontalAlignment(0);
		resul.add(resultat); 
		
		c.add(resul); 
		this.pack(); 
	}
	
	public static void main (String args[]) {
		MainWindow f = new MainWindow(); 
		
		f.setVisible(true);
		
	}
}
