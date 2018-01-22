package control;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import Abstraction.Donnees;
import Abstraction.Excel;
import Presentation.fenetreModifier;

import  java.io.*;

public class controlExporter implements ActionListener{
	
	private JMenu parentComponent;
	private Donnees donnees;
	public controlExporter(JMenu parentComponent, Donnees donnees) {
		this.donnees = donnees;
		this.parentComponent = parentComponent;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (donnees.Calcul == false) {
			JOptionPane.showMessageDialog(null, "Veuillez faire un calcul avant d'exporter.");
		}
		else {
	        JFileChooser boiteSauver = new JFileChooser();
	        boiteSauver.setFileFilter(new FileNameExtensionFilter("Fichier excel", "xls"));
	              
	        try{
	        	  boiteSauver.showSaveDialog(parentComponent);
	  	          String path = boiteSauver.getSelectedFile().getPath();
	  	          Excel excel = new Excel(path+".xls", "Resultats", this.donnees);
	  	          excel.Exporter();
	  	          System.out.println(path);	
			   }
	        catch (Exception e){JOptionPane.showMessageDialog(null, "Veuillez choisir un endroit où exporter.");}
		
		}
	}

}


