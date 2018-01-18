package Presentation;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;

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

import Abstraction.Donnees;
import control.controlCalcul;
import control.controlCheckBox;
import control.controlCopy;
import control.controlExporter;
import control.controlInfo;
import control.controlJCombo1;
import control.controlModif;


public class MainWindow extends JFrame{
	public Donnees donnees;
	

	
	public MainWindow () { 
		super("ESAT-Coût d'une pièce"); 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		this.donnees = new Donnees() ;
		// partie Abstraction :

		Container c = this.getContentPane(); 
		c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
	
		JMenuBar menu = new JMenuBar(); 
		JMenu copy2 = new JMenu("Menu");
		JMenu modifier = new JMenu("Modifier"); 
		JMenu exporter = new JMenu("Exporter...");
		JMenuItem modif = new JMenuItem("Modifier"); 
		modif.addActionListener(new controlModif());
		modifier.add(modif);
		exporter.addActionListener(new controlExporter(exporter, this.donnees));
		JMenuItem copy3 = new JMenuItem("Copyright");
		JMenuItem copy4 = new JMenuItem("Informations"); 
		copy3.addActionListener(new controlCopy());
		copy4.addActionListener(new controlInfo());
		copy2.add(copy4);
		copy2.add(copy3);
		menu.add(copy2); 
		menu.add(modifier);
		menu.add(exporter);
		this.setJMenuBar(menu);
		JPanel choix = new JPanel(); 
		choix.setLayout(new GridLayout(2,13));
		
		
		
		JCheckBox check = new JCheckBox("Tri"); 
		Integer[] prog = {1,2,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24}; 
		JComboBox<Integer> lavage = new JComboBox<Integer>(prog);
		JLabel NomProg = new JLabel("Programme");
		JPanel programme = new JPanel(); 
		programme.setLayout(new BorderLayout());
		
		
		/*Integer[] mach = {1,2,3,4,5}; 
		JComboBox<Integer> machine = new JComboBox<Integer>(mach);
		JLabel NomMachine = new JLabel("Machine");
		JPanel mac = new JPanel(); 
		mac.setLayout(new BorderLayout());
		mac.add(NomMachine,BorderLayout.WEST);
		mac.add(machine,BorderLayout.CENTER);*/
		
		
		JCheckBox presech = new JCheckBox("Préséchage"); 
		
		Integer[] sech = {0,1,2,3}; 
		JComboBox<Integer> sechoir = new JComboBox<Integer>(sech);
		JLabel NomSech = new JLabel("Sechage");
		JPanel sec = new JPanel(); 
		lavage.addItemListener(new controlJCombo1(lavage,sechoir,this.donnees,0));
		sechoir.addItemListener(new controlJCombo1(lavage,sechoir,this.donnees,1));
		
		programme.add(NomProg,BorderLayout.WEST);
		programme.add(lavage,BorderLayout.CENTER);
		
		
		sec.setLayout(new BorderLayout());
		sec.add(NomSech,BorderLayout.WEST);
		sec.add(sechoir,BorderLayout.CENTER);
		
		JCheckBox calandre = new JCheckBox("Calandre"); 
		
		
		JCheckBox defroissage = new JCheckBox("Défroissage"); 	
		
		JCheckBox repassage = new JCheckBox("Repassage"); 	
		
		JCheckBox cintre = new JCheckBox("Mise sur cintre"); 	
		
		JCheckBox pliage = new JCheckBox("Pliage"); 
		
		JCheckBox emballage = new JCheckBox("Emballage"); 	

		ArrayList<JCheckBox> checkboxs = new ArrayList<JCheckBox>(); 
		checkboxs.add(check); //0
		check.addItemListener(new controlCheckBox(checkboxs,0,donnees.boutonValeurs,0,this.donnees));
		
		checkboxs.add(presech); //2
		presech.addItemListener(new controlCheckBox(checkboxs,2,donnees.boutonValeurs,1,this.donnees));

		
		checkboxs.add(calandre); //4
		calandre.addItemListener(new controlCheckBox(checkboxs,4,donnees.boutonValeurs,2,this.donnees));

		
		checkboxs.add(defroissage); //5
		defroissage.addItemListener(new controlCheckBox(checkboxs,5,donnees.boutonValeurs,3,this.donnees));

		
		checkboxs.add(repassage); //6
		repassage.addItemListener(new controlCheckBox(checkboxs,6,donnees.boutonValeurs,4,this.donnees));

		
		checkboxs.add(cintre); //7
		cintre.addItemListener(new controlCheckBox(checkboxs,7,donnees.boutonValeurs,5,this.donnees));

		
		checkboxs.add(pliage); //8
		pliage.addItemListener(new controlCheckBox(checkboxs,8,donnees.boutonValeurs,6,this.donnees));

		
		checkboxs.add(emballage); //9
		emballage.addItemListener(new controlCheckBox(checkboxs,9,donnees.boutonValeurs,7,this.donnees));

		
		
		choix.add(check);
		//choix.add(mac); 
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
		resul.setLayout(new GridLayout(1,3));
		
		JButton calculer = new JButton("Calcul");
		resul.add(calculer);
		calculer.addActionListener(new controlCalcul(new fenetreResultat(this.donnees)));
		/*JLabel nomResul = new JLabel("Le coût de la pièce est :"); 
		nomResul.setHorizontalAlignment(0);
		JLabel resultat = new JLabel("0"); 
		resultat.setHorizontalAlignment(0);
		resul.add(nomResul);
		resul.add(resultat); */
		
		c.add(resul); 
		this.pack(); 
	}
	
	public static void main (String args[]) {
		MainWindow f = new MainWindow(); 
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
	}
}
