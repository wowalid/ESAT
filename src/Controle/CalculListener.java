package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;


public class CalculListener implements ActionListener{

	private ArrayList<JCheckBox> ACheckBox = new ArrayList<JCheckBox>();

	public void actionPerformed(ActionEvent arg0) {
		int compteur = 0;
		for (JCheckBox c : this.ACheckBox) {
			if (c.isSelected()) {

			}
			else {

			}
			
			compteur++;
		}
	}

}
