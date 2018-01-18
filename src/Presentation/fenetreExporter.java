package Presentation;

import java.awt.Container;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class fenetreExporter extends JFrame{
	public fenetreExporter(){
		super("Choisir un répertoire");
		Container c = this.getContentPane();
		
	    // Exemple numéro 2
	    // Boîte de sélection de fichier à partir du répertoire courant
	    File repertoireCourant = null;
	    try {
	        // obtention d'un objet File qui désigne le répertoire courant. Le
	        // "getCanonicalFile" n'est pas absolument nécessaire mais permet
	        // d'éviter les /Truc/./Chose/ ...
	        repertoireCourant = new File(".").getCanonicalFile();
	        System.out.println("Répertoire courant : " + repertoireCourant);
	    } catch(IOException e) {}
	     
	    // création de la boîte de dialogue dans ce répertoire courant
	    // (ou dans "home" s'il y a eu une erreur d'entrée/sortie, auquel
	    // cas repertoireCourant vaut null)
	    JFileChooser dialogue = new JFileChooser(repertoireCourant);
	     
	    // affichage
	    dialogue.showOpenDialog(null);
	    c.add(dialogue); 
	    // récupération du fichier sélectionné
	    this.pack();
	}


}
