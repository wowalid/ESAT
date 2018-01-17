package control;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Observable;
import java.util.Observer;




public class controlCheckBox implements ItemListener, Observer{

	private int lig;
	private int col;
	
	public controlCheckBox(int lig, int col) {
		this.lig = lig;
		this.col = col;
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getStateChange() == ItemEvent.SELECTED) {

		}
		else {		
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {

	}

}
