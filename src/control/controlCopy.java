package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class controlCopy implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Réalisé par \n Jérémie Kalonji \n Basile Goussard \n Walid Arbel \n Kevin Ferin",null,0,new ImageIcon("images"+File.separator+"copyright.jpg"));
		
	}
	

}
