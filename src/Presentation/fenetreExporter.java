package Presentation;

import java.awt.Container;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class fenetreExporter extends JFrame{
	public fenetreExporter(){
		super("Choisir un r�pertoire");
		Container c = this.getContentPane();
		
	    // Exemple num�ro 2
	    // Bo�te de s�lection de fichier � partir du r�pertoire courant
	    File repertoireCourant = null;
	    try {
	        // obtention d'un objet File qui d�signe le r�pertoire courant. Le
	        // "getCanonicalFile" n'est pas absolument n�cessaire mais permet
	        // d'�viter les /Truc/./Chose/ ...
	        repertoireCourant = new File(".").getCanonicalFile();
	        System.out.println("R�pertoire courant : " + repertoireCourant);
	    } catch(IOException e) {}
	     
	    // cr�ation de la bo�te de dialogue dans ce r�pertoire courant
	    // (ou dans "home" s'il y a eu une erreur d'entr�e/sortie, auquel
	    // cas repertoireCourant vaut null)
	    JFileChooser dialogue = new JFileChooser(repertoireCourant);
	     
	    // affichage
	    dialogue.showOpenDialog(null);
	    c.add(dialogue); 
	    // r�cup�ration du fichier s�lectionn�
	    this.pack();
	}


}
