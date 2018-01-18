package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;

import Abstraction.Donnees;
import Abstraction.Excel;
import Presentation.fenetreExporter;
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
		
	        fenetreExporter fen= new fenetreExporter();
	        fen.setLocationRelativeTo(null);
	        fen.setVisible(true);
		}
	}


