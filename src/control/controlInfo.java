package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class controlInfo implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Ce programme calcule le co�t du passage d'une pi�ce\n dans la blanchesserie en fonction de son process");
		
	}

}
