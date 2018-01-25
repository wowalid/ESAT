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

public class fenetrePoids extends JFrame{
	private Donnees donnees;
	
	public fenetrePoids (Donnees donnees) { 

		super("Modifier"); 
		String[] pieces = {"ALESE 1 place",
				"ALESE 2 places",
				"ALESE ENFANT",
				"ALEZE DE TAIE",
				"BLOUSE ",




				"BONNET",
				"CASQUETTE",
				"CASQUETTES AVEC COQUES",
				"CHASUBLES",
				"CHAUSSETTES DE FOOTBALL",
				"CHEMISES",

				"COMBINAISON",


				"COTTE TRAVAIL",
				"COUETTE 1 PLACE",
				"COUETTE 2 PLACES",
				"COUETTE ENFANT",
				"COUPE VENT",
				"COUSSINS",
				"COUVERTURE 1 PLACE",
				"COUVERTURE 2 PLACES",

				"COUVERTURE D'ENFANT",
				"CRAVATTE",
				"DESSUS DE LIT",


				"DRAP HOUSSE 1 PLACE",
				"DRAP HOUSSE 2 PLACES",
				"DRAP HOUSSE ENFANT",
				"DRAP PLAT 1 PLACE",
				"DRAP PLAT 2 PLACES",
				"DRAP PLAT ENFANT",
				"DRAPEAU",
				"DUVET",

				"FRANGE",
				"GANT",
				"GILET SAUVETAGE",
				"HOUSSE COUETTE 1 PLACE",
				"HOUSSE COUETTE ENFANT",
				"HOUSSE DE COUETTE 2 PLACES",
				"HOUSSE DE COUSSIN",
				"HOUSSE MATELAS 1 PLACE",
				"HOUSSE MATELAS 2 PLACES",
				"KIMONO",
				"MAILLOT ",
				"NAPPE 12 COUVERTS",
				"NAPPE 14 COUVERTS",
				"NAPPE 18 COUVERTS",
				"NAPPE 8 COUVERTS",
				"PANTALON",
				"PANTALON DE CUISINE",

				"PANTALON DE SURVETEMENT",
				"PANTALON DE TOILE",
				"PANTALON DE TRAVAIL",
				"PANTALON GRAISSE",
				"PANTALON GRAND FROID",
				"PARKA",
				"PEIGNOIR",
				"PELUCHE AU KG",
				"POLO",

				"RIDEAU DE DOUCHE M²",
				"RIDEAU M²",
				"RIDEAU PLASTIFIE M²",

				"SAC A DOS",
				"SAC LINGE",
				"SAC MEDICAL",
				"SERPILLERE",
				"SERVIETTE DE TABLE",
				"SERVIETTE DE TOILETTE",
				"SHORT",
				"SORTIE DE BAIN",

				"SWEAT SHIRT",
				"TABLIER OU A BAVETTE",
				"TABLIER BAS DE CUISINE",
				"TABLIER DE PEINTURE",
				"TAIE OREILLER",
				"TAIE TRAVERSIN",
				"TAPIS DE BAIN",
				"TEE SHIRT",
				"TORCHONS",
				"TROUSSE DE TOILETTE",
				"VESTE DE TRAVAIL",
				"VESTE DE SURVEMENT",
				"VESTE D'ESCRIME",
				"CHEMISE ENFANT REPASSAGE",
				"CHEMISE REPASSAGE",
				"HOUSSE COUETTE REPASSAGE 2 PLACES",
				"JUPE REPASSAGE",
				"TAIE REPASSAGE",
				"TEE SHIRT ENFANT REPASSAGE",
				"TEE SHIRT REPASSAGE",
				"TORCHON ROULEAU",
		};
		this.donnees = donnees; 
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(4,1));
		
		JPanel panel = new JPanel();
		JLabel labelPoids = new JLabel("Le poids de la pièce " + pieces[this.donnees.valeurPiece] + " est : " + this.donnees.poidsPiece[this.donnees.valeurPiece-1] + " kg");
		JLabel labelPoids2 = new JLabel("Si vous désirez changer le poids de la pièce, veuillez entrer le nouveau poids en dessous");
		JTextField choisir = new JTextField();
		JButton save = new JButton("Enregistrer");
		c.add(labelPoids);
		c.add(labelPoids2);
		c.add(choisir);
		c.add(save);
 
		this.pack(); 
		
	}
	
}